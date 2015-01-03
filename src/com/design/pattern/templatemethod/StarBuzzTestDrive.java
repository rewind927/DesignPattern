package com.design.pattern.templatemethod;

public class StarBuzzTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.setCustomerWantsCondiments(false);
		coffee.prepareRecipe();

	}
}
