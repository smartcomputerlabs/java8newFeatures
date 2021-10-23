package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<ItemForGrouping> items = Arrays.asList(
		        new ItemForGrouping("Pen", "Stationery", 3.0),
		        new ItemForGrouping("Pencil", "Stationery", 2.0),
		        new ItemForGrouping("Eraser", "Stationery", 1.0),
		        new ItemForGrouping("Milk", "Food", 2.0),
		        new ItemForGrouping("Eggs", "Food", 3.0)
		);

		ToDoubleFunction<ItemForGrouping> priceF = ItemForGrouping::getPrice; //1
System.out.println(items.stream()
		        .collect(Collectors.groupingBy(ItemForGrouping::getCategory)) );
		
		items.stream()
		        .collect(Collectors.groupingBy(ItemForGrouping::getCategory)) //2
		        .forEach((a, b)->{		            double av = b.stream().collect(Collectors.averagingDouble(priceF)); //3
		            System.out.println(b);
		        });

	}

}

class ItemForGrouping{
	
    private String name;
    private String category;
    private double price;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ItemForGrouping(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

   //accessors not shown
}
