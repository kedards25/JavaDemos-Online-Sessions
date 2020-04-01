package com.learning.dependancyinjection_beanfactory.DI_BeanFactory;

public class Milkshakes {

	Flavor flavor;

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}
	
	void makeMilkShake()
	{
		System.out.println("Lets make "+flavor.getFruitName()+" milkshake");
	}
}
