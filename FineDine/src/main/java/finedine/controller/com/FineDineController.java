package main.java.finedine.controller.com;

import main.java.finedine.pojo.com.SignUp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FineDineController {
	@RequestMapping("/home")
	public ModelAndView home() {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		return new ModelAndView("home", "message", message);
	}

	@RequestMapping("/restroframe")
	public ModelAndView restroFrame() {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		return new ModelAndView("restroframe", "message", message);
	}

	@RequestMapping("/signup")
	public ModelAndView signUp(Model model) {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		SignUp signup = new SignUp();
		model.addAttribute("signupform", signup);
		return new ModelAndView("signup", "message", message);
	}
	
	@RequestMapping(value="/signupform", method = RequestMethod.POST)
	public String signUpForm(@ModelAttribute("signupform")SignUp signup) {
		String message = "Sucessfully Registered";
		System.out.println(signup.getCountry());
		//return new ModelAndView("signup", "message", message);
		return "forward:signup.im";
	}

	@RequestMapping("/signin")
	public ModelAndView signIn() {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		return new ModelAndView("signin", "message", message);
	}
}