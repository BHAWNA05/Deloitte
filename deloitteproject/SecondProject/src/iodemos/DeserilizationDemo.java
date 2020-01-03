package iodemos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Customer customer = new Customer();
		ObjectInputStream stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("delu.txt"))));
		customer = (Customer) stream.readObject();
		System.out.println(customer);
	}
}
