import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you want to draw?\n1: Rectange\r\n" + 
				"2: Triangle\r\n" + 
				"3: Circle\r\n" + 
				"4: Exit\r\n" + 
				"");
		int input=sc.nextInt();
		Shape s=null;
		switch(input)
		{
		case 1:	//rectangle
			s=new Rectangle();
			break;
		case 2:	//triangle
			s=new Triangle();
			break;
		case 3: //Circle
			s=new Circle();
			break;
		}
	
		s.calculateArea();
	}

}
