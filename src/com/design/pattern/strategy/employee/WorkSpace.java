package com.design.pattern.strategy.employee;

public class WorkSpace {

    public static void main(String[] args) {

        Employee salesmanEmployee = new Employee(new Salesman());
        Employee engineerEmployee = new Employee(new Engineer());
        Employee merchantEmployee = new Employee(new Merchant());

        System.out.println("salesmanEmployee:" + salesmanEmployee.payAmount());
        System.out.println("engineerEmployee:" + engineerEmployee.payAmount());
        System.out.println("merchantEmployee:" + merchantEmployee.payAmount());
    }
}
