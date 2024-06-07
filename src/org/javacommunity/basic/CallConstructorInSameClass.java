package org.javacommunity.basic;

public class CallConstructorInSameClass {
    String name;
    Integer age;
    CallConstructorInSameClass(){
        //super(); // its allowed
        //this("navneet"); // is not allowed - Recursive constructor invocation error
        System.out.println("I am default constructor");
    }
    CallConstructorInSameClass(String name){
        this();
        System.out.println("I am constructor with name");
        this.name = name;

    }
    CallConstructorInSameClass(Integer age){
        this("Navneet");
        System.out.println("I am default constructor");
        this.age = age;
    }
    public static void main(String[] args) {

    }
}
