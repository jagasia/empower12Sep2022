import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your name:");
		int name;
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		name=br.readLine();
		BufferedInputStream bis=new BufferedInputStream(System.in);
		name=bis.read();
		System.out.println(name);
	}

}
