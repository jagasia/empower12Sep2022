import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		List<String> countryList=new ArrayList<String>();
		countryList.add("India");
		countryList.add("Australia");
		countryList.add("Pakistan");
		countryList.add("China");
		countryList.add("Korea");
		countryList.add("South Korea");
		countryList.add("Sri lanka");
		countryList.add("Japan");
		countryList.add("Italy");
		countryList.add("Bangladesh");
		countryList.add("Nepal");
		countryList.add("Bhutan");
		countryList.add("Afghanistan");
		countryList.add("Tanzania");
		countryList.add("Germany");
		
		countryList.stream()
		.filter((x)->x.length()>10)
		.map((x)->x.toUpperCase())
		.sorted()
//		.forEach((x)->System.out.println(x));
		.forEach(System.out::println);
	}

}
