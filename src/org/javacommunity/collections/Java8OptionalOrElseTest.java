package org.javacommunity.collections;

import java.util.Optional;

public class Java8OptionalOrElseTest<optn> {
    void testOptional() {
        Optional<String> optional = Optional.of("NonEmptyString");
        System.out.println(optional.isPresent());
    }
}
