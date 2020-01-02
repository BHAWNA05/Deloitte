package iodemos;

import java.io.File;
import java.io.IOException;

public class AssignmentIO {
	public static void main(String[] args) throws IOException {
		File file = new File("e:\\deloitte\\Batch\\BatchMates.txt");
		File file1 = new File("e:\\deloitte\\Batch");
		File arr[] = file1.listFiles();
		if(file.exists())
		{
			System.out.println("File created");
			file.delete();
		}
		else
		{    file1.mkdir();
		     
			file.createNewFile();
			System.out.println("New File Created");
		}
		for(File file2:arr)
		{   if(file.exists() && file2.isFile()==true)
		   { 
			
			System.out.println(file2  + "  is a file");
		    }
		else
		{
			System.out.println(file2 + " is a directory");
		}
		
			
		}
	}
}
