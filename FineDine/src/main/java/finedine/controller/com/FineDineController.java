package main.java.finedine.controller.com;

import java.util.Calendar;

import javax.validation.Valid;

import main.java.finedine.entitypojo.com.RestaurantLiveEntity;
import main.java.finedine.entitypojo.com.UsersEntity;
import main.java.finedine.pojo.com.Billing;
import main.java.finedine.pojo.com.Booking;
import main.java.finedine.pojo.com.SignIn;
import main.java.finedine.pojo.com.SignUp;
import main.java.finedine.services.com.IM2_Dbservice;

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

	@RequestMapping("/home")
	public ModelAndView home() {
		String message = "JIT";
		return new ModelAndView("home", "message", message);
	}

	@RequestMapping("/signup")
	public ModelAndView signUp(Model model) {
		// clear everything from fields
		String message = "JIT";
		SignUp signupform = new SignUp();
		model.addAttribute("signupform", signupform);
		return new ModelAndView("signup", "message", message);
	}

	@RequestMapping(value = "/signupform", method = RequestMethod.POST)
	public ModelAndView signUpForm(
			@ModelAttribute("signupform") @Valid SignUp signupform,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Country is null");
		} else {
			System.out.println(signupform.getCountry());
		}
		String message = "Sucess";
		return new ModelAndView("signin", "message", message);
	}

	@RequestMapping("/signin")
	public ModelAndView signIn(Model model) {
		String message = "JIT";
		SignIn signIn = new SignIn();
		model.addAttribute("signinform", signIn);
		return new ModelAndView("signin", "message", message);
	}

	@RequestMapping(value = "/signinform", method = RequestMethod.POST)
	public ModelAndView signInForm(
			@ModelAttribute("signinform") @Valid SignIn signinform,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("signin", "signinform", signinform);
		} else {
			Billing billing = new Billing();
			Booking booking = new Booking();
			ModelAndView model = new ModelAndView();
			model.addObject("bookingform", booking);
			model.addObject("billingform", billing);
			model.setViewName("restroframe");
			return model;
		}

	}

	@RequestMapping("/restroframe")
	public ModelAndView restroFrame(Model model) {
		Billing billing = new Billing();
		Booking booking = new Booking();
		model.addAttribute("bookingform", booking);
		model.addAttribute("billingform", billing);
		return new ModelAndView("restroframe");
	}

	@RequestMapping(value = "/billingform", method = RequestMethod.POST)
	public String billingForm(
			@ModelAttribute("billingform") @Valid Billing billingform,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			System.out.println(billingform.getList());
		}
		billingform.getList().clear();
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
				System.out.println("hello :"
						+ restaurantLiveEntity.getBookedseat());
				int vacantSeats = Integer.parseInt(restaurantLiveEntity
						.getMaxseat())
						- Integer
								.parseInt(restaurantLiveEntity.getBookedseat());
				model.addAttribute("bookedseats",
						restaurantLiveEntity.getBookedseat());
				model.addAttribute("maxseats",
						restaurantLiveEntity.getMaxseat());
				model.addAttribute("vacantseats", vacantSeats);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "forward:restroframe.im";
	}
}