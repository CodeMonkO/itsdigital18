package main.java.finedine.interceptor.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.finedine.pojo.com.SignIn;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserCheckInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest req,
			HttpServletResponse httpResponse, Object arg2, ModelAndView arg3)
			throws Exception {

		httpResponse.setHeader("Cache-Control",
				"no-cache, no-store, must-revalidate"); // HTTP//
		// 1.1
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0
		httpResponse.setDateHeader("Expires", 0); // Proxies

	}

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest,
			HttpServletResponse httpResponse, Object arg2) throws Exception {
		HttpSession session = httpServletRequest.getSession();

		if (session == null || session.isNew()) {
			if (!httpResponse.isCommitted())
				httpResponse.sendRedirect("signin.im");
		}
		session.setMaxInactiveInterval(60);
		String uri = httpServletRequest.getRequestURI();
		if (!uri.endsWith("signin.im")) {
			SignIn signin = (SignIn) httpServletRequest.getSession()
					.getAttribute("AUTHENTICATE_USER");
			if (signin == null) {
				httpResponse.sendRedirect("signin.im");
				return false;
			}
		}
		return true;
	}

}
