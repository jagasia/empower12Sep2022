import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App_ObjectInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emp.dat"));
		Employee emp=(Employee) ois.readObject();
		System.out.println(emp);
		System.out.println(emp.getName());
	}

}
