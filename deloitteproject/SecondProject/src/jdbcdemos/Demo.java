package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class Demo {
	public static void main(String[] args) throws Exception  {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","admin"); //local ip address and 1521 is port number oracle works and xe is database
		System.out.println("Connected");
		Statement stat = connection.createStatement();
		ResultSet rst = stat.executeQuery("select * from hr.customer");
		while(rst.next())
		{
			System.out.print(rst.getInt(1) + " ");
			System.out.print(rst.getString(2) + " ");
			System.out.print(rst.getString(3) + " ");
			System.out.println(rst.getInt(4) + " ");
		}
		stat.close();
		connection.close();
	}

}
