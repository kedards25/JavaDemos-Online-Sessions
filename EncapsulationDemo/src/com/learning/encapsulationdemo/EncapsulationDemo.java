package com.learning.encapsulationdemo;

public class EncapsulationDemo {

	//in order to implement encapsulation
	//we should declare variables private 
	//and methods accessing the variables as public
	
	private int num;
	private String value;
	
	//in order to make these variables accessible
	//we should create getters and setters
	
	public void setValue(String val)
	{
		value=val;
	}
	
	public String getValue()
	{
		return value;
	}
	
	//right click on screen anywhere
	//take mouse to "source" click on generate getters and setters in 
	//panel opened next to it

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.setValue("Kedar");
		System.out.println(demo.getValue());
	}

}
