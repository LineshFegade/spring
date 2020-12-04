package com.spring.congiguration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class MyWebConfiguration implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		//Step1- AnnotationConfigWebApplication object created
				AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
				
		//Step2-look for the spring configuration in class which has been annotated with @configure
				ctx.register(SpringConfiguration.class);
				
		//Step3-Setting the servlet context
				ctx.setServletContext(container);
		        
		//Step4-Registering the dispatcher servlet with("/") as URL Pattern and set early load on startup
				ServletRegistration.Dynamic servlet = container.addServlet(
						"dispatcher", new DispatcherServlet(ctx));

				servlet.setLoadOnStartup(1);
				servlet.addMapping("/"); //every request
		
	}

	

}
