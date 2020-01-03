package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileDemo {
public static void main(String[] args) throws IOException {
	String fs = File.separator;  //instead of \\
	File file =  new File("mohan.txt");
	FileWriter writer1 = new FileWriter(file);
	writer1.write("Bhawna Rajput");
	File file1 = new File("E:Workspace\\SecondProject\\ricky.txt");
	file.createNewFile();// after creating it creates in same project folder
	FileReader reader = new FileReader("ricky.txt");
	FileWriter writer = new FileWriter("mohan.txt");
	int i=0;
	while((i=reader.read()) !=-1)
	{   char str = (char)i;
		System.out.println((char)i);
		if(file1.exists())
		{
			writer.write((char)str);
		}
		
	}
	writer.close();
	reader.close();
}
	
	
	
}
