
public class App1 {

	public static void main(String[] args) {
//		String str1="hello";
//		String str2="hello";
		String str1=new String("hello");
		String str2=new String("hello");
		System.out.println(str1==str2); 		//true
		System.out.println(str1.equals(str2));	//true
	}

}
