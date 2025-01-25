package org.javacommunity.collections;

import java.math.BigDecimal;
import java.util.List;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<BigDecimal> prices = List.of(new BigDecimal("10.00"), new BigDecimal("20.00"), new BigDecimal("30.00"));

        // Imperative style
        BigDecimal totalDiscount = BigDecimal.ZERO;
        for (BigDecimal price : prices) {
            totalDiscount = totalDiscount.add(price.multiply(new BigDecimal("0.1")));
        }

        // Functional style
        BigDecimal totalOfDiscountedPrices = prices.stream()
                .map(price -> price.multiply(new BigDecimal("0.1")))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total Discount (Imperative): " + totalDiscount);
        System.out.println("Total Discount (Functional): " + totalOfDiscountedPrices);
    }
}
