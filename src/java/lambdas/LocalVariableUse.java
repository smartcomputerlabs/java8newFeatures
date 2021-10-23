package lambdas;

import java.util.function.Predicate;
class Employee{
    int age;   //1
}

public class LocalVariableUse{

   public static boolean validateEmployee(Employee e, Predicate<Employee> p){
       return p.test(e);
   }
    
   public static void main(String[] args) {
       Employee e = new Employee(); //2
       System.out.println(validateEmployee(e, e->e.age<10000)); //3
   }
}