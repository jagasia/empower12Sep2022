import java.io.File;
import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		File f=new File("yash.txt");
		//the above path is an absolute path.
//		System.out.println(f.getAbsolutePath());
		long x = f.lastModified();
		Date dt=new Date(x);
		System.out.println(x);
		System.out.println(dt);
		long y=dt.getTime();
		System.out.println(y);
	}

}
