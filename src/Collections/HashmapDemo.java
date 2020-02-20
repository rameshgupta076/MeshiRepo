package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1234, "Ramesh");
		hm.put(2, "Gupta");
		hm.put(3, "Rudra");
		hm.put(3, "Vedu");
		hm.put(5, "Vedanshi");
		hm.put(6, "Ramesh");

		System.out.println(hm);
		Set<Integer> s = hm.keySet();

		System.out.println(s);

		// For Values

		Collection<String> cs = hm.values();

		System.out.println(cs);

		// To get Key Value pair Method Use Entry Set method

		Set <Entry<Integer,String>>  en = hm.entrySet();
		for (Entry<Integer,String> e:en){
			
			System.out.println(e.getKey() +" " + e.getValue());
		}
		

	}

}
