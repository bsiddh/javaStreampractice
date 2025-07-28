package com.lambdaexpression.java;

import java.util.Scanner;

@FunctionalInterface
interface details{
    String votersCompleteDetails(String name,int age,String city);
}

public class voterDetails {



    public static void main(String[] args) {
        Scanner inputTheAge = new Scanner(System.in);
        System.out.println("input the age value :");
        int votersAge = inputTheAge.nextInt();
        details voterInformation = (name,age,city) -> age>=18 ?"Eligible for voting "+name+","+city :"Not eligible for voting: "+name;

        System.out.println(voterInformation.votersCompleteDetails("Siddharth",votersAge,"Bengaluru"));
    }
}
