import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App_Data2 {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(new FileInputStream("anirudh.txt"));
		int i=dis.readInt();
		float f=dis.readFloat();
		boolean b=dis.readBoolean();
		System.out.println(i);
		System.out.println(f);
		System.out.println(b);
		
	}

}
