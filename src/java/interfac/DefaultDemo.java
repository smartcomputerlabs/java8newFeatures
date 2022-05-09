package interfac;


 interface House{
   public default String getAddress(){
      return "101 Main Str";
   }
 }

 interface Bungalow extends House{
	 //interface Bungalow { this will result in compilation error inside class MyHouse
   public default String getAddress(){
      return "chilInterface";
   }
 }

 class MyHouse implements Bungalow, House{

 }

 public class DefaultDemo {

   public static void main(String[] args) {
     House ci = new MyHouse();  //1
     System.out.println(ci.getAddress()); //2
   }
 }