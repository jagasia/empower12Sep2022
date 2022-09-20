import java.util.HashSet;

public class App1 {

	public static void main(String[] args) {
		HashSet<Integer> marks=new HashSet<>();
		marks.add(20);
		marks.add(90);
		marks.add(20);	//ignored
		marks.add(100);
		marks.add(30);
		marks.add(90);	//ignored
		marks.add(50);
		marks.add(40);
		marks.add(80);
		marks.add(60);
		marks.add(70);
		marks.add(10);
		
		System.out.println(marks);
	}

}
