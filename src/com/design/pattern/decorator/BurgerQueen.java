package com.design.pattern.decorator;

public class BurgerQueen {

    public static void main(String[] args) {

        Burger submarineSandwich = new SubmarineSandwich();
        System.out.println(submarineSandwich.getDescription());
        System.out.println(submarineSandwich.cost() + "\n");

        Burger sandwich = new Sandwich();
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.cost() + "\n");

        Burger cheeseSandwich = new CheeseSandwich();
        System.out.println(cheeseSandwich.getDescription());
        System.out.println(cheeseSandwich.cost() + "\n");

        Burger baconSandwich = new BaconSandwich();
        System.out.println(baconSandwich.getDescription());
        System.out.println(baconSandwich.cost() + "\n");

        Burger whopper = new WhopperBurger();
        System.out.println(whopper.getDescription());
        System.out.println(whopper.cost() + "\n");
    }

}
