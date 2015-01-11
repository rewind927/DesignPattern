package com.design.pattern.decorator;

public class BurgerQueen {

    public static void main(String[] args) {
        Burger cheeseBurger = new CheeseBurger();
        System.out.println(cheeseBurger.getDescription());
        System.out.println(cheeseBurger.cost()+"\n");
        
        Burger beefBurger = new BeefBurger();
        System.out.println(beefBurger.getDescription());
        System.out.println(beefBurger.cost()+"\n");
        
        Burger chickenBurger = new ChickenBurger();
        System.out.println(chickenBurger.getDescription());
        System.out.println(chickenBurger.cost()+"\n");
        
        Burger baconBurger = new BaconBurger();
        System.out.println(baconBurger.getDescription());
        System.out.println(baconBurger.cost()+"\n");
        
        Burger lettuceBurger = new LettuceBurger();
        System.out.println(lettuceBurger.getDescription());
        System.out.println(lettuceBurger.cost()+"\n");
    }

}
