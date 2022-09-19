import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> countries=new ArrayList<String>();
		countries.add("Australia");
//		countries.add(12.2f);
		countries.add("Bangladesh");
		countries.add("Canada");
		countries.add("Denmark");
		countries.add("England");
		
		ListIterator<String> it = countries.listIterator(countries.size());
		
//		while(it.hasNext())
//		{
//			it.next();
//		}
		///moved to end
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
