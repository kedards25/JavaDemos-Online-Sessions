package com.learning.controllers;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.learning.config.MyConfig;


//This is working as same as web.xml
 
public class MyFrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	//pointing to dispatcher servlet config class
	@Override
	protected Class<?>[] getRootConfigClasses() {
		//Project on compilation will convert '.java' to '.class'
		//hence we are mentioning '.class' and returning array of .class files
		return new Class[] {MyConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	//url-mapping of dispatcher servlet
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
