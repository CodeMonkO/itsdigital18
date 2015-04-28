package main.java.finedine.controller.com;

import java.util.Calendar;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.RestaurantSignUpFormEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.Billing;
import main.java.finedine.pojo.com.Booking;
import main.java.finedine.pojo.com.ForgotPassword;
import main.java.finedine.pojo.com.ResetPassword;
import main.java.finedine.pojo.com.SignIn;
import main.java.finedine.pojo.com.SignUp;
import main.java.finedine.services.com.IM2_Dbservice;
import main.java.finedine.util.com.JPassGenerator;
import main.java.finedine.util.com.Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FineDineController {
	@Autowired
	IM2_Dbservice consumer;
	@Autowired
	HttpSession session;

	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping("/forgotpassword")
	public ModelAndView forgotPassword(Model model) {
		ForgotPassword forgotPassword = new ForgotPassword();
		model.addAttribute("forgotpasswordform", forgotPassword);
		return new ModelAndView("forgotpassword");
	}

	@RequestMapping(value = "/forgotpasswordform", method = RequestMethod.POST)
	public ModelAndView forgotPasswordForm(
			@ModelAttribute("forgotpasswordform") @Valid ForgotPassword forgotPassword,
			BindingResult result, Model model) {
		if (!result.hasErrors()) {
			String vcode = JPassGenerator.getInstance()
					.verificationCodeGenerator(10);
			System.out.println(vcode);
			// Mailer.mailer("");
			session.setAttribute("VERIFICATION_CODE", vcode);
			session.setAttribute("EMAIL", forgotPassword.getEmail());
			ResetPassword resetPassword = new ResetPassword();
			model.addAttribute("resetpasswordform", resetPassword);
			return new ModelAndView("resetpassword");
		} else {
			return new ModelAndView("forgotpassword");// 8899306363
		}
	}

	@RequestMapping("/resetpassword")
	public ModelAndView resetPassword(Model model) {
		return new ModelAndView("resetpassword");
	}

	@RequestMapping(value = "/resetpasswordform", method = RequestMethod.POST)
	public ModelAndView resetpasswordform(
			@ModelAttribute("resetpasswordform") @Valid ResetPassword resetPassword,
			BindingResult result, Model model) {
		System.out.println(resetPassword.getVcode());
		if (null != session.getAttribute("VERIFICATION_CODE")
				&& (Calendar.getInstance().getTimeInMillis() - session
						.getCreationTime()) <= 300000) {
			if (session.getAttribute("VERIFICATION_CODE").equals(
					resetPassword.getVcode())) {
				System.out.println("code matched" + session.getCreationTime());
				consumer.resetPasswordTable(session.getAttribute("EMAIL")
						.toString(), resetPassword.getPassword());
				session.invalidate();
			}
		}
		SignIn signIn = new SignIn();
		model.addAttribute("signinform", signIn);
		return new ModelAndView("signin");
	}

	@RequestMapping("/signup")
	public ModelAndView signUp(Model model) {
		String message = "JIT";
		SignUp signupform = new SignUp();
		model.addAttribute("signupform", signupform);
		return new ModelAndView("signup", "message", message);
	}

	@RequestMapping(value = "/signupform", method = RequestMethod.POST)
	public ModelAndView signUpForm(
			@ModelAttribute("signupform") @Valid SignUp signupform,
			BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			System.out.println("Country is null");
		} else {
			if (signupform.getPassword().equals(signupform.getCpassword())) {
				RestaurantSignUpFormEntity restaurantSignUpFormEntity = new RestaurantSignUpFormEntity();
				restaurantSignUpFormEntity.setAddress(signupform.getAddress());
				restaurantSignUpFormEntity.setAltcontact(signupform
						.getRaltcontact());
				restaurantSignUpFormEntity.setCity(signupform.getCity());
				restaurantSignUpFormEntity.setCitycode("");
				restaurantSignUpFormEntity.setCountry(signupform.getCountry());
				restaurantSignUpFormEntity.setCountrycode("");
				restaurantSignUpFormEntity.setCtime(new java.sql.Timestamp(
						Calendar.getInstance().getTime().getTime()).toString());
				restaurantSignUpFormEntity
						.setMaxseat(signupform.getRmaxseats());
				restaurantSignUpFormEntity.setOtime(new java.sql.Timestamp(
						Calendar.getInstance().getTime().getTime()).toString());
				restaurantSignUpFormEntity.setRating(signupform.getRrating());
				restaurantSignUpFormEntity
						.setRcontact(signupform.getRcontact());
				restaurantSignUpFormEntity.setRmail(signupform.getRmailid());
				restaurantSignUpFormEntity
						.setPassword(signupform.getPassword());
				restaurantSignUpFormEntity.setRname(signupform.getRname());
				restaurantSignUpFormEntity.setRtype(signupform.getRtype());
				restaurantSignUpFormEntity.setState(signupform.getState());
				restaurantSignUpFormEntity.setStatecode("");
				restaurantSignUpFormEntity.setStatus(signupform.getStatus());
				restaurantSignUpFormEntity.setSubtype(signupform.getRsubtype());
				restaurantSignUpFormEntity.setUuid("");
				restaurantSignUpFormEntity.setZipcode(signupform.getZipcode());
				System.out.println(signupform.getCountry());
				consumer.signupTable(restaurantSignUpFormEntity);
				SignIn signIn = new SignIn();
				model.addAttribute("signinform", signIn);
				return new ModelAndView("signin");
			}
		}
		return new ModelAndView("signup");
	}

	@RequestMapping("/signin")
	public ModelAndView signIn(Model model) {
		SignIn signIn = new SignIn();
		model.addAttribute("signinform", signIn);
		return new ModelAndView("signin");
	}

	@RequestMapping(value = "/signinform", method = RequestMethod.POST)
	public ModelAndView signInForm(
			@ModelAttribute("signinform") @Valid SignIn signinform,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("signin", "signinform", signinform);
		} else {
			System.out.println(signinform.getEmail() + " : "
					+ signinform.getPassword());
			ModelAndView model = new ModelAndView("restroframe");
			// if(signinform.getEmail().equalsIgnoreCase("a@a.a"))
			if (consumer.signInTable(signinform)) {
				Billing billing = new Billing();
				Booking booking = new Booking();
				UsersEntity usersEntity = new UsersEntity();
				model.addObject("bookingform", booking);
				model.addObject("billingform", billing);
				model.addObject("customerform", usersEntity);
				model.setViewName("restroframe");
				session.setAttribute("AUTHENTICATE_USER", signinform);
				return model;
			} else {
				return new ModelAndView("signin", "signinform", signinform);
			}

		}
	}

	@RequestMapping("/restroframe")
	public ModelAndView restroFrame(Model model) {
		Billing billing = new Billing();
		Booking booking = new Booking();
		UsersEntity usersEntity = new UsersEntity();
		model.addAttribute("bookingform", booking);
		model.addAttribute("billingform", billing);
		model.addAttribute("customerform", usersEntity);
		return new ModelAndView("restroframe");
	}

	@RequestMapping(value = "/billingform", method = RequestMethod.POST)
	public String billingForm(
			@ModelAttribute("billingform") @Valid Billing billingform,
			BindingResult result) throws AddressException, MessagingException {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			System.out.println(billingform.getList());
		}
		billingform.getList().clear();
		// Mailer.mailer(billingform.getEmailid());
		// return new ModelAndView("restroframe");
		return "redirect:restroframe.im";
	}

	@RequestMapping(value = "/bookingform", method = RequestMethod.POST)
	public String bookingform(
			@ModelAttribute("bookingform") @Valid Booking bookingform,
			BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			UsersEntity usersEntity = new UsersEntity();
			usersEntity.setName(bookingform.getName());
			usersEntity.setBdtime(new java.sql.Timestamp(Calendar.getInstance()
					.getTime().getTime()).toString());
			usersEntity.setBillamt("0");
			usersEntity.setBillpayed("N");
			usersEntity.setRcount("0");
			usersEntity.setTablenum("N");
			usersEntity.setTimezone("IST");
			usersEntity.setVdtime(new java.sql.Timestamp(Calendar.getInstance()
					.getTime().getTime()).toString());
			usersEntity.setVisited("Y");
			usersEntity.setEmailid(bookingform.getEmailid());
			usersEntity.setContactnum(bookingform.getContactno());
			usersEntity.setOccasion(bookingform.getEvent());
			usersEntity.setSeatsbooked(bookingform.getBooking());
			usersEntity.setUuid("uuid");
			try {
				RestaurantLiveEntity restaurantLiveEntity = consumer
						.usersTable(usersEntity);
				int vacantSeats = Integer.parseInt(restaurantLiveEntity
						.getMaxseat())
						- Integer
								.parseInt(restaurantLiveEntity.getBookedseat());
				int bookedseats = Integer.parseInt(restaurantLiveEntity
						.getBookedseat());
				int maxseats = Integer.parseInt(restaurantLiveEntity
						.getMaxseat());
				if (Integer.parseInt(bookingform.getBooking()) <= (maxseats - bookedseats)) {
					System.out.println("hello :"
							+ restaurantLiveEntity.getBookedseat());
					model.addAttribute(
							"bookedseats",
							bookedseats
									+ Integer.parseInt(bookingform.getBooking()));
					model.addAttribute("maxseats", maxseats);
					model.addAttribute(
							"vacantseats",
							vacantSeats
									- Integer.parseInt(bookingform.getBooking()));
				} else {

					System.out.println("hello :"
							+ restaurantLiveEntity.getBookedseat());
					model.addAttribute("bookedseats", bookedseats);
					model.addAttribute("maxseats", maxseats);
					model.addAttribute("vacantseats", vacantSeats);
				}

				if (maxseats == bookedseats) {
					model.addAttribute("housefull", "All seats booked");
				}
				// Mailer.mailer(bookingform.getEmailid());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "forward:restroframe.im";
	}

	@RequestMapping(value = "/customerform", method = RequestMethod.POST)
	public String customerForm(@ModelAttribute("customerform") ModelMap model)
			throws AddressException, MessagingException {
		List<Object> usersEntity = consumer.customerTable("uuid");
		UsersEntity usersEntity2 = (UsersEntity) usersEntity.get(0);
		System.out.println(usersEntity2.getEmailid());
		model.addAttribute("usersEntity", usersEntity2.getEmailid());
		return "forward:restroframe.im";
	}
}