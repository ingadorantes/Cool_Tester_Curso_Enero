package com.java;

public class SimpleCalculator {
	
	private double firstNumber;
	private double secondNumber;
	private double result;
	
	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult () {	
		result= firstNumber+secondNumber;
		return result;
	}
	public double getSubtractionResult () {	
		result= firstNumber-secondNumber;
		return result;
	}
	public double getMultiplicationResult () {	
		result= firstNumber*secondNumber;
		return result;
	}
	public double getDivisionResult () {	
		result= secondNumber/firstNumber;
		return result;
	}
	
	public static boolean hasTeen (int a, int b, int c) {
		boolean bandera;
		boolean ar=SimpleCalculator.isTeen(a);
		boolean br=SimpleCalculator.isTeen(b);
		boolean cr=SimpleCalculator.isTeen(c);
		
		if (ar||br||cr) {
			bandera=true;
		}else {
			bandera=false;
		}	
		return bandera;
	}
	public static boolean isTeen (int a) {
		boolean bandera;
		if (a>=13&&a<=19) {
			bandera=true;
		}else {
			bandera=false;
		}	
		return bandera;
	}

}
