package accountgenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountGenerator {
	Employee x;

	public AccountGenerator(Employee x) {
		this.x = x;
	}

	public void serializeData( Employee x) throws IOException {
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(x);
	}
	public Object deSerialize () throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		return ois.readObject();
	}
}
