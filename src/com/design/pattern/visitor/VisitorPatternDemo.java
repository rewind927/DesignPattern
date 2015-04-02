package com.design.pattern.visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();

        System.out.println("== Show all computer part: ==");
        computer.accept(new ComputerPartDisplayVisitor());

        System.out.println("\n== Show user input part: ==");
        computer.accept(new UserInputVisitor());
    }
}