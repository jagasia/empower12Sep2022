import java.io.File;

public class App2 {

	public static void main(String[] args) {
		File f= new File("d:\\jag");
//		String[] arr = f.list();
//		for(String s:arr)
//			System.out.println(s);
//		
		File[] arr = f.listFiles();
		for(File file:arr)
		{
//			if(file.isFile())
//				System.out.println(file.getName());
			if(file.isDirectory())
				System.out.println(file.getName());
		}
	}

}
