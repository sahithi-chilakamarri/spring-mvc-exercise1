package com.stackroute.exercise;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
//This is the dispatcherservlet which acts as the front controller
public class FrontControllerConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //Creating the object
        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        //Registering the configuratrion class
        webCtx.register(Config.class);
        webCtx.setServletContext(servletContext);
        //Adding the dispatcherservlet class object
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
        servlet.setLoadOnStartup(1);
        //Maps to all the request which are ending with the /
        servlet.addMapping("/");
    }
}
