package org.javacommunity.basic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingJavaCommunityBlog {

    public static void main(String[] args) {
        // create a list
        List<Item> cart = Arrays.asList(new Item("Cosmetic", "Nail Polish", new BigDecimal(10)),
                new Item("Grocery", "Pea Nuts", new BigDecimal(15.5)),
                new Item("Cosmetic", "Eye Shadow", new BigDecimal(8.5)),
                new Item("Cosmetic", "Eye Liner", new BigDecimal(11.5)),
                new Item("Cosmetic", "Eye Pencil", new BigDecimal(11.5)),
                new Item("Cosmetic", "Foundation", new BigDecimal(10.0)));
        // Let's find total discount of all cosmetic items
        // Imperative style
        BigDecimal totalDiscount = BigDecimal.ZERO;
        BigDecimal flatDiscount = new BigDecimal(15.50);
        for (Item item : cart) {
            if(item.getType().equals("Cosmetic")) {
                totalDiscount = totalDiscount.add(item.getPrice().multiply(flatDiscount));
            }
            totalDiscount = totalDiscount.add(item.getPrice().multiply(flatDiscount));
        }

        // Functional style
        BigDecimal totalOfDiscountedPrices = cart.stream()
                .filter(item -> item.getPrice().equals("Cosmetic")).map(item -> (item.getPrice().multiply(flatDiscount)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total Discount (Imperative): " + totalDiscount);
        System.out.println("Total Discount (Functional): " + totalOfDiscountedPrices);
    }
    // Created an inner Item class for simplicity, this can be a separate class as well
    static class Item {
        private int id;
        private String name;
        private String type;
        private BigDecimal price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }
        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public Item(String type, String name,BigDecimal price) {
            this.type = type;
            this.name = name;
            this.price = price;
        }
        public String toString(){
            return this.getName();
        }
    }
}
