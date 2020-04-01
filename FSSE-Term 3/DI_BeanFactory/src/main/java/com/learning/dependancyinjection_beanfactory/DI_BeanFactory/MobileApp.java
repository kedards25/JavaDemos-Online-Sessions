package com.learning.dependancyinjection_beanfactory.DI_BeanFactory;

public class MobileApp implements AmazonVideos {

	String videoType;

	
	
	public MobileApp(String videoType) {
		super();
		this.videoType = videoType;
	}


//	public String getVideoType() {
//		return videoType;
//	}
//
//	
//	public void setVideoType(String videoType) {
//		this.videoType = videoType;
//	}
//	

	public void watchVideos() {
		// TODO Auto-generated method stub
		System.out.println("Lets watch " + videoType + " on Mobile");
	}
	

}
