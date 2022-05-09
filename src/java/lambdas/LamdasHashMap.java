package lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdasHashMap {
	Map<String, List<Double>> groupedValues = new HashMap<>();
	public static void main(String[] args) {
		
	}
	/*public void process(String name, Double value){
	    List<Double> values = groupedValues.get(name);
	    if(values == null){
	        values = new ArrayList<Double>();
	        groupedValues.put(name, values);
	    }
	    values.add(value);
	}*/
/*	public void process(String name, Double value){
	    groupedValues.computeIfAbsent(name, (a)->new ArrayList<Double>()).add(value);
	}*/

/*	public void process(String name, Double value){
	    groupedValues.computeIfAbsent(name, (a, b)->new ArrayList<Double>()).add(value);
	}
	*/
	public void process(String name, Double value){
	    groupedValues.computeIfPresent(name, (a, b)->new ArrayList<Double>()).add(value);
	}
	
}
