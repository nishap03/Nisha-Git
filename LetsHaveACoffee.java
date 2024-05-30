package com.lao.conditional_statements;

public class LetsHaveACoffee {

	boolean isCupEmpty = false;
	public static void main(String[] args) {
		LetsHaveACoffee coffee = new LetsHaveACoffee();
		if(coffee.isCupEmpty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Drink the coffee");
		}
		System.out.println("My name is Nisha");
	}

}
