/**
 * 
 */
package com.imt.junit;

/**
 * @author imteyaz
 *
 */
public class Calculator {

	public double add(double number1, double number2) {
		return number1 + number2;
	}

	public double substract(double number1, double number2) {
		return number1 - number2;
	}

	public double multiply(double number1, double number2) {
		return number1 * number2;
	}

	public double division(double number1, double number2) {
		if (number2 != 0) {
			return number1 / number2;
		}
		throw new ArithmeticException();
	}
}
