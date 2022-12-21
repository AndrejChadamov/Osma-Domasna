package zadaca02;
import java.util.HashMap;
import java.util.Map;
public class Recnik {
	Map<String,String> recnik = new HashMap<String,String>();
	public void vnesiMapa() {
	recnik.put("Mother", "Majka");
	recnik.put("Father", "Tatko");
	recnik.put("Grandfather", "Dedo");
	recnik.put("Grandmother", "Baba");
}
	
	public void translate (String s) {
		if(recnik.containsKey(s))
		{
			System.out.print(recnik.get(s));
		}
		else 
			System.out.print("Ne postoi takov zbor vo recnikot");
	}
}