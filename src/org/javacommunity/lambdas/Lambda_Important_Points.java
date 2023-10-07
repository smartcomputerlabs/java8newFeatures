package org.javacommunity.lambdas;

public class Lambda_Important_Points {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = n -> System.out.println("A function without name is " + n);// implementation without signature
        greet(myFunctionalInterface, "Lamda Function");
    }

    private static void greet(MyFunctionalInterface greetingsInstance, String name) {
        greetingsInstance.myLamdaFunction(name);
    }
}
@FunctionalInterface
interface MyFunctionalInterface {
    public void myLamdaFunction(String name); // it's an abstract function
}