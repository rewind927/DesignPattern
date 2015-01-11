package com.design.pattern.decorator;

public class BurgerQueen {

    public static void main(String[] args) {
        
        Burger beefBurger = new SubmarineSandwich();
        System.out.println(beefBurger.getDescription());
        System.out.println(beefBurger.cost()+"\n");
        
        Burger baconBurger = new Sandwitch();
        System.out.println(baconBurger.getDescription());
        System.out.println(baconBurger.cost()+"\n");
        
        Burger lettuceBurger = new Whopper();
        System.out.println(lettuceBurger.getDescription());
        System.out.println(lettuceBurger.cost()+"\n");
    }

}
