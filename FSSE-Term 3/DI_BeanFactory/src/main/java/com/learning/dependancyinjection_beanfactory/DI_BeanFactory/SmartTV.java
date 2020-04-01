package com.learning.dependancyinjection_beanfactory.DI_BeanFactory;

public class SmartTV implements AmazonVideos{
	
	String videoType;
	
	
	
	
	public SmartTV(String videoType) {
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


	public void watchVideos()
	{
		System.out.println("Lets watch "+videoType+" on TV");
	}
}
