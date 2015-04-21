package main.java.finedine.controller.com;

import javax.validation.Valid;

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

	@RequestMapping("/restroframe")
	public ModelAndView restroFrame() {
		String message = "JIT";
		return new ModelAndView("restroframe", "message", message);
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
			  @ModelAttribute("signupform") @Valid SignUp signupform, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Country is null");
		} else {
			System.out.println(signupform.getCountry());
		}
		String message = "Sucess";
		return new ModelAndView("signin", "message", message);
	}

	@RequestMapping("/signin")
	public ModelAndView signIn() {
		String message = "JIT";
		return new ModelAndView("signin", "message", message);
	}
}