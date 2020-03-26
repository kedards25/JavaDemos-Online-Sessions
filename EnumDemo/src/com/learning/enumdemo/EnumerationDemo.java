package com.learning.enumdemo;

public class EnumerationDemo {
	enum COLORS {
		RED, GREEN, BLUE, ORANGE
	};
//
//	void showColor(COLORS color) {
//		switch (color) {
//		case RED:
//			System.out.println("You chose Red Color");
//			break;
//		case GREEN:
//			System.out.println("You chose GREEN Color");
//			break;
//		case BLUE:
//			System.out.println("You chose BLUE Color");
//			break;
//		case ORANGE:
//			System.out.println("You chose ORANGE Color");
//			break;
//
//		default:
//			break;
//		}
//	}

	void showColors()
	{
		for(COLORS color:COLORS.values())
		{
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
			EnumerationDemo enumDemo=new EnumerationDemo();
			//enumDemo.showColor(COLORS.ORANGE);
			enumDemo.showColors();
	}

}
