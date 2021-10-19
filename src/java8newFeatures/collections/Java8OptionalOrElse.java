package java8newFeatures.collections;

import java.util.Optional;

public class Java8OptionalOrElse<optn> {
    void testOptional() {
        Optional<String> optional = Optional.of("NonEmptyString");
        System.out.println(optional.isPresent());
    }
}
