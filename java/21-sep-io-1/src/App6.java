import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App6 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\rjaga\\Pictures\\vada.jpg");
		FileOutputStream fos=new FileOutputStream("Sruth.jpg");
		int data=-1;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			fos.flush();
		}
		System.out.println("Check");
		
	}

}
