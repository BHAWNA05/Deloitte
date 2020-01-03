package iodemos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile file = new RandomAccessFile("friday.txt","rw");
	file.writeUTF("Today is friday");
	System.out.println(file.getFilePointer());
	file.seek(0);
	System.out.println(file.getFilePointer());
	String str = file.readUTF();
	System.out.println("File content is :");
	System.out.println(str);
	file.seek(file.length());
	file.writeUTF("Bhawna Rajput");
	file.seek(0);
	String str1 = file.readUTF();
		file.close();
		System.out.println(str1);

}
}
