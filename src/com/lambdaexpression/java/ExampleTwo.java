package com.lambdaexpression.java;

@FunctionalInterface
interface Operations
{
    void  add(int valOne,int valTwo);
}
public class ExampleTwo {

    public static void main(String[] args) {
        Operations o1 = (int valOne,int valTwo) ->System.out.println("Additon of two values :"+(valOne+valTwo));
        o1.add(10,10);

        Operations o2 = (valOne, valTwo) -> System.out.println(valOne+valTwo);
        o2.add(88,92);
    }
}
