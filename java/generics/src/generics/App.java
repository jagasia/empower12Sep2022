package generics;

import java.util.ArrayList;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		ArrayList marks=new ArrayList();
		marks.add(new Integer(20));
		marks.add(new Float(2.2f));
		marks.add("India");
		marks.add(new Date());
		System.out.println("Fine");
	}

}
