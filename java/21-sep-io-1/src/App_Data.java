import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App_Data {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("anirudh.txt"));
		dos.writeInt(125);
		dos.writeFloat(12.2f);
		dos.writeBoolean(true);
		dos.flush();
		dos.close();
		//---------------
	}

}
