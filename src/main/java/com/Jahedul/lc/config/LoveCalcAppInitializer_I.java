//package com.Jahedul.lc.config;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
////This class is the Replacement of the web.xml. where you used to create the dispactherservlet and url mapping stuff.
////This is Approach - I **In this approach developer has the full control over the Dispacther Servlet Object.
////But wait there is also approach II where creating DS is more simplified and Spring has the full control over DS object.
//public class LoveCalcAppInitializer_I implements WebApplicationInitializer {
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        //setting up the config file
////        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
////        webApplicationContext.setConfigLocation("classpath:application-config.xml");
//
//        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
//        webApplicationContext.register(LoveCalcAppConfig.class);
//
//        //creating a dispatcherservlet Object
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
//
//        //registering the Servlet Object
//        ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",dispatcherServlet);
//        myCustomDispatcherServlet.setLoadOnStartup(1);
//        myCustomDispatcherServlet.addMapping("/love-calculator.com/*");
//
//    }
//}
