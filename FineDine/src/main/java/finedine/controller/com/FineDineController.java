package main.java.finedine.controller.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FineDineController {
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		String message = "Welcome to Spring 4.0 !!! dineshonjava.com";
		return new ModelAndView("about", "message", message);
	}
}