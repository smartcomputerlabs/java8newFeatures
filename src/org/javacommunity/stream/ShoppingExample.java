package org.javacommunity.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingExample {
    public static void main(String[] args) {

        List<BigDecimal> prices = new ArrayList<>(Arrays.asList(BigDecimal.valueOf(20),BigDecimal.valueOf(30),BigDecimal.valueOf(30)
                ,BigDecimal.valueOf(30),BigDecimal.valueOf(30),BigDecimal.valueOf(30),BigDecimal.valueOf(30)));

        final BigDecimal totalOfDiscountedPrices =
                prices.stream()
                        .filter(price -> price.compareTo(BigDecimal.valueOf(20d)) > 0)
                        .map(price -> price.multiply(BigDecimal.valueOf(0.1)))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total Discount Earned: " + totalOfDiscountedPrices);
    }
}
