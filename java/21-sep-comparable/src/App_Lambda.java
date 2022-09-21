import java.util.TreeSet;

public class App_Lambda {

	public static void main(String[] args) {
		TreeSet<Integer> marks=new TreeSet<>((x,y)->y-x);
		marks.add(80);
		marks.add(100);
		marks.add(90);
		marks.add(55);
		marks.add(86);
		marks.add(19);
		marks.add(95);
		marks.add(45);
		for(Integer m:marks)
			System.out.println(m);
	}

}
