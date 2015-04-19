package main.java.finedine.controller.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView signUp() {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		return new ModelAndView("signup", "message", message);
	}

	@RequestMapping("/signin")
	public ModelAndView signIn() {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		return new ModelAndView("signin", "message", message);
	}
}