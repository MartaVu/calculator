package com.endava.calculator;

public class TestClass {

    public static void main(String[] args) {

        BasicCalculator basicCalculator = new BasicCalculator();

//        System.out.println(basicCalculator.add(7, 5, 3));
//        System.out.println(basicCalculator.substract(10, 5, 2, -5));
//        System.out.println(basicCalculator.multiply(3, 5, 2));
//        System.out.println(basicCalculator.multiply(300000L,50005210L));
//        System.out.println(basicCalculator.multiply(1.3, 2.55));
        System.out.println(basicCalculator.divide(11, 3));
//        System.out.println(basicCalculator.divide(6.2, 3.3));
//        System.out.println(basicCalculator.divide(66658479652L, 325799542L));
//
        ExpertCalculator expertCalculator = new ExpertCalculator();
        
        System.out.println(expertCalculator.pow(2,3));
        System.out.println(expertCalculator.pow(2,0));
        System.out.println(expertCalculator.pow(2,-3));
        System.out.println(expertCalculator.root(2.0));
        System.out.println(expertCalculator.factorial(3));
        System.out.println(expertCalculator.factorialR(3));
    }
}