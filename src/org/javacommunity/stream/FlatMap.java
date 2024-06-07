package org.javacommunity.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * Returns a java.util.stream.Stream consisting of the results of replacing each element of this java.util.stream.Stream with
 * the contents of a mapped java.util.stream.Stream produced by applying the provided mapping function to each element.
 * Each mapped java.util.stream.Stream is closed after its contents have been placed into this java.util.stream.Stream.
 * (If a mapped java.util.stream.Stream is null an empty java.util.stream.Stream is used, instead.)
 * 
 * @author javacommunity.org
 * 
 */
public class FlatMap {

	public static void main(String[] args) {
		//System.out.println(Stream.of("Fred", "Jim", "Sheila")
         //       .collect(String::new, String::concat, String::concat));
		
		Stream<List<String>> s1 = Stream.of(
                Arrays.asList("a", "b"),
                Arrays.asList("d", "c"),Arrays.asList("a", "b"),Arrays.asList("a", "c"),Arrays.asList("a", "b")
        );
        OrderItem orderItem1 = new OrderItem("2111",true,2);
        OrderItem orderItem2 = new OrderItem("3111",false,1);
        OrderItem orderItem3 = new OrderItem("4111",true,2);
        OrderItem orderItem4 = new OrderItem("5111",false,1);
        OrderItem orderItem5 = new OrderItem("6111",true,3);
        OrderItem orderItem6 = new OrderItem("7111",false,2);
        OrderItem orderItem7 = new OrderItem("8111",true,1);
        OrderItem orderItem8 = new OrderItem("9111",false,2);
        OrderItem orderItem9 = new OrderItem("2112",true,3);

        ArrayList<OrderItem> orderItemList1 = new ArrayList<>();
        ArrayList<OrderItem> orderItemList2 = new ArrayList<>();
        ArrayList<OrderItem> orderItemList3 = new ArrayList<>();

        orderItemList1.add(orderItem1);orderItemList1.add(orderItem2);orderItemList1.add(orderItem3);
        orderItemList1.add(orderItem4);orderItemList1.add(orderItem5);orderItemList1.add(orderItem6);
        orderItemList1.add(orderItem7);orderItemList1.add(orderItem8);orderItemList1.add(orderItem9);

        Order firstOrder = new Order("1111","HomeAddress","SameDayDelivery",orderItemList1);
        Order secondOrder = new Order("2222","HomeAddress","SameDayDelivery",orderItemList2);
        Order thirdOrder = new Order("3333","OfficeAddress","SameDayDelivery",orderItemList3);

        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(firstOrder);orderList.add(secondOrder);orderList.add(thirdOrder);
       // Stream<String> news = s1.filter(s->s.contains("c"))
       //     .flatMap(olds -> olds.stream());

        Stream<OrderItem> items = orderList.stream().filter(order -> order.getAddress().equals("HomeAddress")).flatMap(order -> order.getItemList().stream());
        items.forEach(System.out::println);

    
   // String s = "sss";
   // Object j = s;
    
    Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
    //Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); //2
   // System.out.println(obj);

	}

}
class Order{
    String orderId;
    String address;
    String deliveryType;
    List<OrderItem> itemList;
    Order(String orderId,String address,String deliveryType,List<OrderItem> itemList){
        this.orderId = orderId;
        this.address = address;
        this.deliveryType = deliveryType;
        this.itemList = itemList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItem> itemList) {
        this.itemList = itemList;
    }
}
class OrderItem{
    String itemId;
    boolean premium;
    Integer quantity;
    OrderItem(String itemId,boolean premium,Integer quantity){
        this.itemId = itemId;
        this.premium = premium;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
