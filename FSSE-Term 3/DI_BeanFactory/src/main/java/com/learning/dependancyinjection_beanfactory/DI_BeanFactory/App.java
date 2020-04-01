package com.learning.dependancyinjection_beanfactory.DI_BeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Following tight Coupling should be avoided
//        AmazonVideos amazonVideos=new SmartTV();
//        amazonVideos.watchVideos();
//        
//        AmazonVideos videos=new MobileApp();
//        videos.watchVideos();
    	
    	//Loose Coupling
    	
    	//using BeanFactory
//    	Resource resource=new ClassPathResource("beans.xml");
//    	BeanFactory factory=new XmlBeanFactory(resource);
    	
    	//using ApplicationContext
    	
//    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//    	AmazonVideos videos=(SmartTV)context.getBean("smart");
//    	videos.watchVideos();
    	
    	//Autowiring by Name
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Milkshakes mk=(Milkshakes)context.getBean("milkshake");
    	mk.makeMilkShake();
    }
}
