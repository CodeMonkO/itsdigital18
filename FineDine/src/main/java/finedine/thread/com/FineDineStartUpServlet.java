package main.java.finedine.thread.com;

import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import main.java.finedine.services.com.IM2_Dbservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class FineDineStartUpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private WebApplicationContext springContext;
	@Autowired
	private IM2_Dbservice consumer;
	@Autowired
	public Properties messages;
	@Override
	public void init(final ServletConfig config) throws ServletException {
		super.init(config);
        springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
        final AutowireCapableBeanFactory beanFactory = springContext.getAutowireCapableBeanFactory();
        beanFactory.autowireBean(this);
		ScheduledTrigger.getInstance().trigger(consumer,messages);
	}

}
