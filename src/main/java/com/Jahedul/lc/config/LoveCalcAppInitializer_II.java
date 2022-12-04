package com.Jahedul.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalcAppInitializer_II extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected Class<?>[] getRootConfigClasses() {

        return null;

    }

    protected Class<?>[] getServletConfigClasses() {
        Class arr[] = {LoveCalcAppConfig.class};

        return arr;
    }

    protected String[] getServletMappings() {
        String arr[] = {"/"};

        return arr;
    }
}
