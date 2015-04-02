package com.design.pattern.visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void accept(UserInputVisitor userInputVisitor) {
        userInputVisitor.visit(this);
    }
}