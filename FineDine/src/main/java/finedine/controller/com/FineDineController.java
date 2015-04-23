package main.java.finedine.controller.com;

import javax.validation.Valid;

import main.java.finedine.pojo.com.Billing;
import main.java.finedine.pojo.com.SignIn;
import main.java.finedine.pojo.com.SignUp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FineDineController {
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
	public String signInForm(
			@ModelAttribute("signinform") @Valid SignIn signinform,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			System.out.println(signinform.getEmail());
		}
		String message = "Sucess";
		return "forward:restroframe.im";
	}

	@RequestMapping("/restroframe")
	public ModelAndView restroFrame(Model model) {
		String message = "JIT";
		Billing billing = new Billing();
		model.addAttribute("billingform", billing);
		return new ModelAndView("restroframe");
	}

	@RequestMapping(value = "/billingform", method = RequestMethod.POST)
	public ModelAndView billingForm(
			@ModelAttribute("billingform") @Valid Billing billingform,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getFieldError());
		} else {
			System.out.println(billingform.getList().get(0));
		}
		billingform.getList().clear();
		String message = "Sucess";
		return new ModelAndView("restroframe");
	}

}