
public class App {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
//		Runtime r=new Runtime();
//		Sun s=new Sun();
		Sun s=Sun.getInstance();
		s.setName("Surya");
		System.out.println(s);
		
	
		Sun s1=Sun.getInstance();
		s1.setName("Kathir");
		
		System.out.println(s.getName());
		
	}

}
