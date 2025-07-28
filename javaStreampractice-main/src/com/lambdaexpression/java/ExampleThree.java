package com.lambdaexpression.java;

@FunctionalInterface
interface service{
    String login(String username,String password);
}

public class ExampleThree {

    public static void main(String[] args) {
    service sOne = (username,password) -> {return username.equalsIgnoreCase("Siddharth")
            && password.equals("m1m1")
    ?"Login success":"Login failed";};
  String status = sOne.login("sai","m1m1");
//    System.out.println("Login status :"+status);

    service sTwo = (username,password) -> {return  username.equalsIgnoreCase("sourav")
    && password.equals("m2m2")
            ?"LogedIn successfully":"Failed to login";};
    String secondStatus = sTwo.login("sourav","m2m2");
    System.out.println("Logedin status :"+secondStatus);
     }

}
