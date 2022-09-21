import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App5FileInputStream {

	public static void main(String[] args) throws IOException {
		//read bytes from the C:\Users\rjaga\Pictures\briyani1.jfif
		File f1=new File("C:\\Users\\rjaga\\Pictures\\briyani1.jfif");
		FileInputStream fis=new FileInputStream(f1);
		int len=(int) f1.length();
		System.out.println("There are "+len+" bytes in that file");
		byte []data=new byte[len];
		fis.read(data);
		fis.close();
		
		//write all the bytes into a new file
		FileOutputStream fos=new FileOutputStream("shashak.jfif");
		fos.write(data);
		fos.flush();
		fos.close();
		System.out.println("check");
	}

}
