package com.chainsys.day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Calculator cal = new Calculator();
	Scanner math = new Scanner(System.in);
	System.out.println("Enter any two numbers to arithmetic operations");
	int num1 = math.nextInt();
	int num2 = math.nextInt();
	System.out.println("sum of num : " + (num1 + num2));

	}
}
