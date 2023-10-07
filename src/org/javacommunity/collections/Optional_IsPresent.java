package org.javacommunity.collections;

import java.util.Optional;

public class Optional_IsPresent {
    void testOptional() {
        Optional<String> optional = Optional.of("NonEmptyString");
        System.out.println(optional.isPresent());
    }
}
