package com.lambdaexpression.java;

@FunctionalInterface
interface Greeting
{
    void greet();
//    void value();
}


public class ExampleOne {

    public static void main(String[] args) {
        Greeting gone = ()->{
            System.out.println("lambda expression first example");
        };
    }
}
