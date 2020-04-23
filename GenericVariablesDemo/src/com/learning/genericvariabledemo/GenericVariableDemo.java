package com.learning.genericvariabledemo;

public class GenericVariableDemo <S>{

	S val;
	
	public S getVal() {
		return val;
	}

	public void setVal(S val) {
		this.val = val;
	}



	public static void main(String[] args) {

		GenericVariableDemo<Integer> intObj=new GenericVariableDemo();
		intObj.setVal(52);
		System.out.println(intObj.getVal());
		
		
		//by default java expects double in decimal values 
		GenericVariableDemo<Float> floatObj=new GenericVariableDemo();
		//hence we need to mention F as suffix
		floatObj.setVal(52.5F);
		System.out.println(floatObj.getVal());
	}

}
