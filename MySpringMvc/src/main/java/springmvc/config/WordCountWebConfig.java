package springmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WordCountWebConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
		wac.register(SpringApplicationConfig.class);
		
//		XmlWebApplicationContext webAc = new XmlWebApplicationContext();
//		webAc.setConfigLocation("classpath:appconfig.xml");

		// Create DC
		DispatcherServlet ds = new DispatcherServlet(wac);

		// Register DC
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", ds);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");

		System.out.println(dispatcher.getName());	
		
	

	}

}
