import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(20);	//converting primitive into wrapper = Boxing
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(70);
		marks.add(90);
		marks.add(80);
		marks.add(70);
		marks.add(100);
		marks.add(40);
//		marks.remove(new Integer(20));
		
//		Collections.sort(marks);
//		
//		System.out.println(marks);
//		//we can access an element of the array using the index
//		System.out.println(marks.get(-1));
		
//		for(Integer x:marks)
//		{
//			if(x%15==0)
//				marks.remove(new Integer(x));
//			System.out.println(x);
//		}
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext())
		{
			Integer temp = it.next();
			if(temp%15==0)
				it.remove();
//			System.out.println(it.next());
		}
	}

}
