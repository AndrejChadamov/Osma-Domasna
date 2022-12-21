package zadaca01;
import java.util.HashMap;
import java.util.Map;
public class Glavna {

	public static void main (String [] args) {
		Map<String,String> recnik = new HashMap<String,String>();
		recnik.put("one", "eden");
		recnik.put("two", "dva");
		recnik.put("three", "tri");
		recnik.put("four", "cetiri");
		recnik.put("five", "pet");
		
		System.out.println("Klucevi: "+recnik.keySet());
		System.out.println("Vrednosti: " +recnik.values());
		
		for (Map.Entry<String,String> entry: recnik.entrySet()) {
			System.out.println(entry.getKey()+" | "+entry.getValue());
		}
		
		if (recnik.containsKey("four"))
			System.out.println("Vrednosta (prevodot) za four e: "+recnik.get("four"));
		else
			System.out.println("Ne postoi zbor four");
	}
}
