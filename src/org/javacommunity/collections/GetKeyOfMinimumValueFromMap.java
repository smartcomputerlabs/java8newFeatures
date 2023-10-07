package org.javacommunity.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GetKeyOfMinimumValueFromMap {
    public static void main(String[] args) {
        Map<String,Integer> nameAge = new HashMap<>();
        nameAge.put("Ares",11);
        nameAge.put("Zion",2);
        nameAge.put("Navneet",41);

        Optional<String> minDisVertex = nameAge.keySet().stream().reduce((key1, key2) -> {
            if(nameAge.get(key1) < nameAge.get(key2)){
                System.out.println(" -- minimum dis key --"+key1);
                return key1;
            }else{
                System.out.println(" -- minimum dis key --"+key2);
                return key2;
            }
        });
    }
}
