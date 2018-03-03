package com.cxf.rest.example.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
/**
 * 
 * @author Anil Kumar
 *
 */
public class HindustaniAirwaysWebIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
	 	AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        webCtx.register(HindustaniAirwaysConfig.class);
        ctx.addListener(new ContextLoaderListener(webCtx));
        ServletRegistration.Dynamic dispatcher =ctx.addServlet("CXFServlet", new CXFServlet());
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");	
        dispatcher.setInitParameter("contextConfigLocation", "com.cxf.rest.example.config.HindustaniAirwaysConfig");
	}

}
