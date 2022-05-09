package collections;

import java.util.Optional;

public class Optional_Or_Else {
    void testOptional() {
        Optional<String> optional = Optional.of("NonEmptyString");
        System.out.println(optional.isPresent());
    }
}
