package main.java.finedine.controller.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import main.java.finedine.cache.com.MostRecentlyLoggedInUsers;
import main.java.finedine.constants.com.Constants.Constant;
import main.java.finedine.constants.com.Constants.Views;
import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.Bill;
import main.java.finedine.pojo.com.Billing;
import main.java.finedine.pojo.com.Booking;
import main.java.finedine.pojo.com.ForgotPassword;
import main.java.finedine.pojo.com.ResetPassword;
import main.java.finedine.pojo.com.SignIn;
import main.java.finedine.pojo.com.SignUp;
import main.java.finedine.services.com.IM2_Dbservice;
import main.java.finedine.util.com.AESencrp;
import main.java.finedine.util.com.CustomUtils;
import main.java.finedine.util.com.GenerateInvoice;
import main.java.finedine.util.com.GenerateUUID;
import main.java.finedine.util.com.JPassGenerator;
import main.java.finedine.util.com.ReadCSVFile;
import main.java.finedine.util.com.SeatsCalculation;
import main.java.finedine.util.com.UploadFilesOnToServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FineDineController {
	@Autowired
	IM2_Dbservice consumer;
	@Autowired
	HttpSession session;
	@Autowired
	public Properties messages;

	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView(Views.HOME.getViewName());
	}

	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView SignOut(Model model) throws AddressException, MessagingException {
		SignIn signIn = new SignIn();
		model.addAttribute(Constant.SIGNINFORM.getConstantValue(), signIn);
		return new ModelAndView(Views.SIGNIN.getViewName());
	}

	@RequestMapping("/forgotpassword")
	public ModelAndView forgotPassword(Model model) {
		ForgotPassword forgotPassword = new ForgotPassword();
		model.addAttribute("forgotpasswordform", forgotPassword);
		return new ModelAndView(Views.FORGOTPASSWORD.getViewName());
	}

	@RequestMapping(value = "/forgotpasswordform", method = RequestMethod.POST)
	public ModelAndView forgotPasswordForm(@ModelAttribute("forgotpasswordform") @Valid ForgotPassword forgotPassword, BindingResult result, Model model) {
		if (!result.hasErrors()) {
			String vcode = JPassGenerator.getInstance().verificationCodeGenerator(10);
			System.out.println(vcode);
			// Mailer.mailer("");
			session.setAttribute(Constant.VERIFICATIONCODE.getConstantValue(), vcode);
			session.setAttribute(Constant.EMAIL.getConstantValue(), forgotPassword.getEmail());
			ResetPassword resetPassword = new ResetPassword();
			model.addAttribute("resetpasswordform", resetPassword);
			return new ModelAndView(Views.RESETPASSWORD.getViewName());
		} else {
			return new ModelAndView(Views.FORGOTPASSWORD.getViewName());// 8899306363
		}
	}

	@RequestMapping("/resetpassword")
	public ModelAndView resetPassword(Model model) {
		return new ModelAndView("resetpassword");
	}

	@RequestMapping(value = "/resetpasswordform", method = RequestMethod.POST)
	public ModelAndView resetpasswordform(@ModelAttribute("resetpasswordform") @Valid ResetPassword resetPassword, BindingResult result, Model model) {
		System.out.println(resetPassword.getVcode());
		if (null != session.getAttribute(Constant.VERIFICATIONCODE.getConstantValue()) && (Calendar.getInstance().getTimeInMillis() - session.getCreationTime()) <= Integer.parseInt(Constant.SESSIONTIMEOUT.getConstantValue())) {
			if (session.getAttribute(Constant.VERIFICATIONCODE.getConstantValue()).equals(resetPassword.getVcode())) {
				System.out.println("code matched" + session.getCreationTime());
				try {
					consumer.resetPasswordTable(session.getAttribute(Constant.EMAIL.getConstantValue()).toString(), AESencrp.getInstance().getEncryptedPassword(resetPassword.getPassword()));
				} catch (Exception e) {
					e.printStackTrace();
				}
				session.invalidate();
			}
		}
		SignIn signIn = new SignIn();
		model.addAttribute(Constant.SIGNINFORM.getConstantValue(), signIn);
		return new ModelAndView(Views.SIGNIN.getViewName());
	}

	@RequestMapping("/signup")
	public ModelAndView signUp(Model model) {
		SignUp signupform = new SignUp();
		model.addAttribute(Constant.SIGNUPFORM.getConstantValue(), signupform);
		return new ModelAndView(Views.SIGNUP.getViewName());
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signUpGet() {
		ReadCSVFile readCSVFile = new ReadCSVFile();
		Map<String, String> countryMap = readCSVFile.getMapOfCSV(messages.getProperty(Constant.COUNTRYCSVPATH.getConstantValue()), messages.getProperty(Constant.COUNTRYNAME.getConstantValue()), messages.getProperty(Constant.COUNTRYCODE.getConstantValue()));
		List<String> countryList = readCSVFile.getList(countryMap, "k");
		Map<String, String> stateMap = readCSVFile.getMapOfCSV(messages.getProperty(Constant.STATECSVPATH.getConstantValue()), messages.getProperty(Constant.STATENAME.getConstantValue()), messages.getProperty(Constant.STATECODE.getConstantValue()));
		List<String> statesList = readCSVFile.getList(stateMap, "k");
		CustomUtils customUtils = CustomUtils.getInstance();
		List<String> restroTypeList = customUtils.getListFromString(messages.getProperty("signup.restauranttype"), messages.getProperty("signup.delim"));
		ModelAndView model = new ModelAndView(Views.SIGNUP.getViewName());
		SignUp signupform = new SignUp();
		model.addObject(Constant.SIGNUPFORM.getConstantValue(), signupform);
		model.addObject("countryList", countryList);
		model.addObject("statesList", statesList);
		model.addObject("restroTypeList", restroTypeList);
		return model;
	}
	
	
	@RequestMapping(value = "/signupform", method = RequestMethod.GET)
	public ModelAndView signUpFormGet() {
		ReadCSVFile readCSVFile = new ReadCSVFile();
		Map<String, String> countryMap = readCSVFile.getMapOfCSV(messages.getProperty(Constant.COUNTRYCSVPATH.getConstantValue()), messages.getProperty(Constant.COUNTRYNAME.getConstantValue()), messages.getProperty(Constant.COUNTRYCODE.getConstantValue()));
		List<String> countryList = readCSVFile.getList(countryMap, "k");
		Map<String, String> stateMap = readCSVFile.getMapOfCSV(messages.getProperty(Constant.STATECSVPATH.getConstantValue()), messages.getProperty(Constant.STATENAME.getConstantValue()), messages.getProperty(Constant.STATECODE.getConstantValue()));
		List<String> statesList = readCSVFile.getList(stateMap, "k");
		CustomUtils customUtils = CustomUtils.getInstance();
		List<String> restroTypeList = customUtils.getListFromString(messages.getProperty("signup.restauranttype"), messages.getProperty("signup.delim"));
		ModelAndView model = new ModelAndView(Views.SIGNUP.getViewName());
		SignUp signupform = new SignUp();
		model.addObject(Constant.SIGNUPFORM.getConstantValue(), signupform);
		model.addObject("countryList", countryList);
		model.addObject("statesList", statesList);
		model.addObject("restroTypeList", restroTypeList);
		return model;
	}
	
	@RequestMapping(value = "/signupform", method = RequestMethod.POST)
	public ModelAndView signUpForm(@ModelAttribute("signupform") @Valid SignUp signupform, BindingResult result, ModelMap model) throws IOException {
		if (result.hasErrors()) {
			System.out.println("Country is null");
		} else {
			if (signupform.getPassword().equals(signupform.getCpassword())) {
				try {
					ReadCSVFile readCSVFile = new ReadCSVFile();
					Map<String, String> countryMap = readCSVFile.getMapOfCSV(messages.getProperty(Constant.COUNTRYCSVPATH.getConstantValue()), messages.getProperty(Constant.COUNTRYNAME.getConstantValue()), messages.getProperty(Constant.COUNTRYCODE.getConstantValue()));
					Map<String, String> stateMap = readCSVFile.getMapOfCSV(messages.getProperty(Constant.STATECSVPATH.getConstantValue()), messages.getProperty(Constant.STATENAME.getConstantValue()), messages.getProperty(Constant.STATECODE.getConstantValue()));
					RestaurantSignUpFormEntity restaurantSignUpFormEntity = new RestaurantSignUpFormEntity();
					restaurantSignUpFormEntity.setAddress(signupform.getAddress());
					restaurantSignUpFormEntity.setAltcontact(signupform.getRaltcontact());
					restaurantSignUpFormEntity.setCity(signupform.getCity());
					restaurantSignUpFormEntity.setCitycode(signupform.getZipcode());
					restaurantSignUpFormEntity.setCountry(signupform.getCountry());
					restaurantSignUpFormEntity.setCountrycode(countryMap.get(signupform.getCountry()).toUpperCase());
					restaurantSignUpFormEntity.setCtime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()).toString());
					restaurantSignUpFormEntity.setMaxseat(signupform.getRmaxseats());
					restaurantSignUpFormEntity.setOtime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()).toString());
					restaurantSignUpFormEntity.setRating(signupform.getRrating());
					restaurantSignUpFormEntity.setRcontact(signupform.getRcontact());
					restaurantSignUpFormEntity.setRmail(signupform.getRmailid());
					restaurantSignUpFormEntity.setPassword(AESencrp.getInstance().getEncryptedPassword(signupform.getPassword()));
					restaurantSignUpFormEntity.setRname(signupform.getRname());
					restaurantSignUpFormEntity.setRtype(signupform.getRtype());
					restaurantSignUpFormEntity.setState(signupform.getState());
					restaurantSignUpFormEntity.setStatecode(stateMap.get(signupform.getState()));
					restaurantSignUpFormEntity.setStatus(signupform.getStatus());
					restaurantSignUpFormEntity.setSubtype(signupform.getRsubtype());
					restaurantSignUpFormEntity.setUuid(new GenerateUUID().getGeneratedUUID(signupform, countryMap, stateMap));
					restaurantSignUpFormEntity.setZipcode(signupform.getZipcode());
					MultipartFile multipartFile = signupform.getFiles().get(0);
					if (new UploadFilesOnToServer().fileWriting(multipartFile, multipartFile.getOriginalFilename(), Constant.UPLOADFILE.getConstantValue().replace("?", signupform.getRmailid()))) {
						restaurantSignUpFormEntity.setMenufilelocation(Constant.UPLOADFILE.getConstantValue().replace("?", signupform.getRmailid()) + multipartFile.getOriginalFilename());
					}
					restaurantSignUpFormEntity.setCountrytimezone(signupform.getTimezone());
					System.out.println(signupform.getCountry());
					RestaurantLiveEntity restaurantLiveEntity = new RestaurantLiveEntity();
					restaurantLiveEntity.setMaxseat(signupform.getRmaxseats());
					restaurantLiveEntity.setBookedseat("0");
					restaurantLiveEntity.setStatusflag(true);
					restaurantLiveEntity.setUuid(restaurantSignUpFormEntity.getUuid());
					if (!consumer.signupTable(restaurantSignUpFormEntity, restaurantLiveEntity)) {
						return new ModelAndView(Views.SIGNUP.getViewName());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				SignIn signIn = new SignIn();
				model.addAttribute(Constant.SIGNINFORM.getConstantValue(), signIn);
				return new ModelAndView(Views.SIGNIN.getViewName());
			}
		}
		return new ModelAndView(Views.SIGNUP.getViewName());
	}

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signIn(Model model) {
		SignIn signIn = new SignIn();
		model.addAttribute(Constant.SIGNINFORM.getConstantValue(), signIn);
		return new ModelAndView(Views.SIGNIN.getViewName());
	}

	@RequestMapping(value = "/signinform", method = RequestMethod.GET)
	public ModelAndView signInFormGet(Model model) {
		SignIn signIn = new SignIn();
		model.addAttribute(Constant.SIGNINFORM.getConstantValue(), signIn);
		return new ModelAndView(Views.SIGNIN.getViewName());
	}

	@RequestMapping(value = "/signinform", method = RequestMethod.POST)
	public ModelAndView signInForm(@ModelAttribute("signinform") @Valid SignIn signinform, BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return new ModelAndView(Views.SIGNIN.getViewName(), Constant.SIGNINFORM.getConstantValue(), signinform);
		} else {
			if (null != signinform.getPassword()) {
				signinform.setPassword(AESencrp.getInstance().getEncryptedPassword(signinform.getPassword()));
			}
			MostRecentlyLoggedInUsers.getInstance();
			Map<String, Object> cache = null;
			if (MostRecentlyLoggedInUsers.getLoggedInUsers().size() > 0 && MostRecentlyLoggedInUsers.getLoggedInUsers().containsKey(signinform.getEmail())) {
				cache = MostRecentlyLoggedInUsers.getLoggedInUsers().get(signinform.getEmail());
			}

			if (null != cache && cache.size() > 0 && System.currentTimeMillis() - Long.parseLong(cache.get(Constant.CACHEACTIVETIMEMS.getConstantValue()).toString()) > Integer.parseInt(Constant.CACHETIMEOUT.getConstantValue())) {
				MostRecentlyLoggedInUsers.getLoggedInUsers().remove(signinform.getEmail());
				session.removeAttribute(Constant.CACHE.getConstantValue());
				session.removeAttribute(Constant.AUTHENTICATEUSER.getConstantValue());
			}
			RestaurantSignUpFormEntity restaurantSignUpFormEntity = null;

			if (null != cache && cache.size() > 0 && System.currentTimeMillis() - Long.parseLong(cache.get(Constant.CACHEACTIVETIMEMS.getConstantValue()).toString()) <= Integer.parseInt(Constant.CACHETIMEOUT.getConstantValue())
					&& (cache.get(Constant.PASSWORD.getConstantValue()).toString()).equalsIgnoreCase(signinform.getPassword())) {
				ModelAndView model = new ModelAndView();
				Billing billing = new Billing();
				Booking booking = new Booking();
				UsersEntity usersEntity = new UsersEntity();
				List<Bill> billList = new ArrayList<Bill>();
				List<String> itemsList = new ArrayList<String>();
				Object objectMenu = cache.get(Constant.MENU.getConstantValue());
				Object objectItemsList = cache.get(Constant.ITEMSLIST.getConstantValue());
				if (objectMenu instanceof List && objectItemsList instanceof List) {
					billList = (List<Bill>) objectMenu;
					itemsList = (List<String>) objectItemsList;
				}
				RestaurantLiveEntity restaurantLiveEntity = consumer.getFromBookingTable(cache.get(Constant.RESTAURANTUUID.getConstantValue()).toString()).get(0);
				SeatsCalculation seatsCalculation = new SeatsCalculation();
				model = seatsCalculation.getSeats(restaurantLiveEntity, model);
				model.addObject(Constant.BOOKINGFORM.getConstantValue(), booking);
				model.addObject(Constant.BILLINGFORM.getConstantValue(), billing);
				model.addObject(Constant.CUSTOMERFORM.getConstantValue(), usersEntity);
				model.addObject(Constant.MENU.getConstantValue(), billList);
				model.addObject(Constant.ITEMSLIST.getConstantValue(), itemsList);
				model.setViewName(Views.RESTROFRAME.getViewName());
				session.setAttribute(Constant.AUTHENTICATEUSER.getConstantValue(), signinform);
				session.setAttribute(Constant.CACHE.getConstantValue(), cache);
				return model;
			} else if ((restaurantSignUpFormEntity = consumer.signInTable(signinform)) != null)
			// if (signinform.getEmail().equalsIgnoreCase("a@a.a"))
			{
				ModelAndView model = new ModelAndView();
				Billing billing = new Billing();
				Booking booking = new Booking();
				UsersEntity usersEntity = new UsersEntity();
				ReadCSVFile readMenuFile = new ReadCSVFile();
				List<Bill> billList = readMenuFile.getListOfMenuItems(restaurantSignUpFormEntity.getMenufilelocation());
				List<String> itemsList = readMenuFile.getListOfItems(billList);
				RestaurantLiveEntity restaurantLiveEntity = consumer.getFromBookingTable(restaurantSignUpFormEntity.getUuid()).get(0);
				SeatsCalculation seatsCalculation = new SeatsCalculation();
				model = seatsCalculation.getSeats(restaurantLiveEntity, model);
				model.addObject(Constant.BOOKINGFORM.getConstantValue(), booking);
				model.addObject(Constant.BILLINGFORM.getConstantValue(), billing);
				model.addObject(Constant.CUSTOMERFORM.getConstantValue(), usersEntity);
				model.addObject(Constant.MENU.getConstantValue(), billList);
				model.addObject(Constant.ITEMSLIST.getConstantValue(), itemsList);
				model.setViewName(Views.RESTROFRAME.getViewName());
				cache = new HashMap<String, Object>();
				cache.put(Constant.PASSWORD.getConstantValue(), signinform.getPassword());
				cache.put(Constant.CACHEACTIVETIMEMS.getConstantValue(), System.currentTimeMillis());
				cache.put(Constant.RESTAURANTUUID.getConstantValue(), restaurantSignUpFormEntity.getUuid());
				cache.put(Constant.ITEMSLIST.getConstantValue(), itemsList);
				cache.put(Constant.MENU.getConstantValue(), billList);
				MostRecentlyLoggedInUsers.getLoggedInUsers().put(signinform.getEmail(), cache);
				session.setAttribute(Constant.AUTHENTICATEUSER.getConstantValue(), signinform);
				session.setAttribute(Constant.CACHE.getConstantValue(), cache);
				return model;
			} else {
				return new ModelAndView(Views.SIGNIN.getViewName(), Constant.SIGNINFORM.getConstantValue(), signinform);
			}
		}
	}

	@RequestMapping("/restroframe")
	public ModelAndView restroFrame(ModelAndView model) {
		Billing billing = new Billing();
		Booking booking = new Booking();
		UsersEntity usersEntity = new UsersEntity();
		Map<String, Object> cache = new HashMap<String, Object>();
		cache = (Map<String, Object>) session.getAttribute(Constant.CACHE.getConstantValue());
		List<Bill> billList = new ArrayList<Bill>();
		List<String> itemsList = new ArrayList<String>();
		if (cache != null && cache.size() > 0) {
			Object objectMenu = cache.get(Constant.MENU.getConstantValue());
			Object objectItemsList = cache.get(Constant.ITEMSLIST.getConstantValue());
			if (objectMenu instanceof List && objectItemsList instanceof List) {
				billList = (List<Bill>) objectMenu;
				itemsList = (List<String>) objectItemsList;
			}
		} else {
			model = new ModelAndView(Views.SIGNIN.getViewName());
			return model;
		}
		model = new ModelAndView(Views.RESTROFRAME.getViewName());
		RestaurantLiveEntity restaurantLiveEntity = consumer.getFromBookingTable(cache.get(Constant.RESTAURANTUUID.getConstantValue()).toString()).get(0);
		SeatsCalculation seatsCalculation = new SeatsCalculation();
		model = seatsCalculation.getSeats(restaurantLiveEntity, model);
		model.addObject(Constant.BOOKINGFORM.getConstantValue(), booking);
		model.addObject(Constant.BILLINGFORM.getConstantValue(), billing);
		model.addObject(Constant.CUSTOMERFORM.getConstantValue(), usersEntity);
		model.addObject(Constant.MENU.getConstantValue(), billList);
		model.addObject(Constant.ITEMSLIST.getConstantValue(), itemsList);
		return model;
	}

	@RequestMapping(value = "/billingform", method = RequestMethod.GET)
	public ModelAndView billingFormGet(Model model) {
		Billing billing = new Billing();
		model.addAttribute(Constant.BILLINGFORM.getConstantValue(), billing);
		return new ModelAndView(Views.RESTROFRAME.getViewName());
	}

	@RequestMapping(value = "/billingform", method = RequestMethod.POST)
	public String billingForm(@ModelAttribute("billingform") @Valid Billing billingform, BindingResult result) throws AddressException, MessagingException {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			GenerateInvoice.Generate(billingform.getList(), Constant.BILLPDF.getConstantValue(), billingform.getEmailid().replace(".", "_"));
			System.out.println(billingform.getList());
		}
		billingform.getList().clear();

		/*
		 * Mailer.mailer(billingform.getEmailid(),MailTemplateReader.readfile());
		 */
		return "redirect:" + Views.RESTROFRAME.getViewName() + ".im";
	}

	@RequestMapping(value = "/bookingform", method = RequestMethod.GET)
	public ModelAndView bookingformGet(Model model) {
		Booking booking = new Booking();
		model.addAttribute(Constant.BOOKINGFORM.getConstantValue(), booking);
		return new ModelAndView(Views.RESTROFRAME.getViewName());
	}

	@RequestMapping(value = "/bookingform", method = RequestMethod.POST)
	public String bookingform(@ModelAttribute("bookingform") @Valid Booking bookingform, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			UsersEntity usersEntity = new UsersEntity();
			usersEntity.setName(bookingform.getName());
			usersEntity.setBdtime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()).toString());
			usersEntity.setBillamt("0");
			usersEntity.setBillpayed("N");
			usersEntity.setRcount("W");
			usersEntity.setTablenum("N");
			usersEntity.setTimezone("IST");
			usersEntity.setVdtime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()).toString());
			usersEntity.setVisited("Y");
			usersEntity.setEmailid(bookingform.getEmailid());
			usersEntity.setContactnum(bookingform.getContactno());
			usersEntity.setOccasion(bookingform.getEvent());
			usersEntity.setSeatsbooked(bookingform.getBooking());
			Map<String, Object> cache = new HashMap<String, Object>();
			cache = (Map<String, Object>) session.getAttribute(Constant.CACHE.getConstantValue());
			if (cache != null && cache.size() > 0) {
				usersEntity.setUuid(cache.get(Constant.RESTAURANTUUID.getConstantValue()).toString());
			} else {
				// log
				return "redirect:" + Views.SIGNIN.getViewName() + ".im";
			}
			try {
				RestaurantLiveEntity restaurantLiveEntity = consumer.usersTable(usersEntity);
				SeatsCalculation seatsCalculation = new SeatsCalculation();
				model = seatsCalculation.getSeats(restaurantLiveEntity, bookingform, model);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "forward:" + Views.RESTROFRAME.getViewName() + ".im";
	}

	@RequestMapping(value = "/customerform", method = RequestMethod.GET)
	public String customerFormGet(@ModelAttribute("customerform") ModelMap model) throws AddressException, MessagingException {
		model.addAttribute("usersEntity", session.getAttribute("usersEntity"));
		return "forward:" + Views.RESTROFRAME.getViewName() + ".im";
	}

	@RequestMapping(value = "/customerform", method = RequestMethod.POST)
	public String customerForm(@ModelAttribute("customerform") ModelMap model) throws AddressException, MessagingException {
		Map<String, Object> cache = new HashMap<String, Object>();
		cache = (Map<String, Object>) session.getAttribute(Constant.CACHE.getConstantValue());
		List<UsersEntity> usersEntity = new ArrayList<UsersEntity>();
		if (cache != null && cache.size() > 0) {
			usersEntity = consumer.customerTable(cache.get(Constant.RESTAURANTUUID.getConstantValue()).toString());
		} else {
			return "redirect:" + Views.SIGNIN.getViewName() + ".im";
		}
		session.setAttribute("usersEntity", usersEntity);
		return "forward:" + Views.RESTROFRAME.getViewName() + ".im";
	}
}