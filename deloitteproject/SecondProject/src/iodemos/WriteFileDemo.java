package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) throws IOException {
		String fs = File.separator;  //instead of \\
		File file =  new File("ricky.txt");
		file.createNewFile();// after creating it creates in same project folder
		FileWriter writer = new FileWriter(file);
		writer.write("My name is Bhawna Rajput");
		writer.close();
	}
		
}
