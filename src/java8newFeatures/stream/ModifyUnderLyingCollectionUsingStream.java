package java8newFeatures.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You can modify the objects of the collection not the collection itself or you can return an updated collection using java8 stream
 * 
 * @author javacommunity.org
 * 
 */
public class ModifyUnderLyingCollectionUsingStream {

	public static void main(String[] args) {
		
		// -- Modify objects of the collection using stream
		
		// Create a list of shopping carts
		List<ShoppingCart> shoppingCartList = Arrays.asList(new ShoppingCart("Soap",5), new ShoppingCart("Chocolate",1));
		
		// shopping carts item before changes
		System.out.println("Initial Shopping Cart");
		shoppingCartList.stream().forEach(shoppingCart -> System.out.println(shoppingCart.itemName +" - "+shoppingCart.itemQuantity));
		
		// Modify the objects of a collection
		shoppingCartList.stream().forEach(shoppingCart -> shoppingCart.itemQuantity = 0);
		
		// shopping carts item after changes
		System.out.println("My Shopping Cart after making changes using java8 stream");
		shoppingCartList.stream().forEach(shoppingCart -> System.out.println(shoppingCart.itemName +" - "+shoppingCart.itemQuantity));
		
		// Get a new updated collection from another collection usng stream 
		
		// Create a list of shopping carts
		List<ShoppingCart> shoppingCartListInitial = Arrays.asList(new ShoppingCart("Soap",5), new ShoppingCart("Chocolate",1));
		
		// Return an updated collection
		List<ShoppingCart> shoppingCartListUpdated = shoppingCartListInitial.stream().map(shoppingCart -> new ShoppingCart(shoppingCart.itemName,shoppingCart.itemQuantity * 2)).collect(Collectors.toList());
		
		System.out.println("My updated Shopping Cart after making changes using java8 stream");
		shoppingCartListUpdated.stream().forEach(shoppingCartUpdated->{ System.out.println(shoppingCartUpdated.itemName +" - "+shoppingCartUpdated.itemQuantity);});
	}

}
class ShoppingCart{
	
	public String itemName;
	public int itemQuantity;
	
	// constructor to create shopping cart object
	ShoppingCart(String itemName,int itemQuantity){
		this.itemName = itemName;	
		this.itemQuantity = itemQuantity;
	}
}