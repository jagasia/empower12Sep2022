import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> countryMap=new HashMap<>();
		countryMap.put(10, "India");
		countryMap.put(1, "Australia");
		countryMap.put(20, "Sri lanka");
		countryMap.put(15, "Pakistan");
		countryMap.put(30, "Bangladesh");
		countryMap.put(25, "China");
		countryMap.put(25, "Russia");
		
//		for(Entry<Integer, String> e:countryMap.entrySet())
//		{
//			System.out.println(e.getKey()+" - "+e.getValue());
//		}
		
		Set<Integer> keys = countryMap.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(key+" - "+countryMap.get(key));
		}
		
	}

}
