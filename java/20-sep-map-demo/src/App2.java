import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character, Integer> result=new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			//check if character in variable c is already found as a key in map?
//			int value=0;
//			if(result.containsKey(c))
//			{
//				value=result.get(c);				
//			}
			Integer value=result.get(c);
			if(value==null)
				value=0;
			value++;
			result.put(c, value);
		}
		for(Entry<Character, Integer> x:result.entrySet())
		{
			System.out.println(x.getKey()+ " - "+ x.getValue());
		}
	}

}
