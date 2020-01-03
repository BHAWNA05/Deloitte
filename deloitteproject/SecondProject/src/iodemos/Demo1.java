package iodemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {
public static void main(String[] args) throws IOException {
	File file = new File("e:\\deloitte\\newfile.txt");
	File file2 = new File("e:\\deloitte\\directory\\directoryindirectory\\file.txt");
	if(file.exists())
	{
		System.out.println("File created");
	}
	else
	{    
		file.createNewFile();
		System.out.println("New File Created");
	}
	System.out.println("Done");
}
}
