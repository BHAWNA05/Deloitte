package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import jdbcdemos.DBConnection;

public class Demo_Select {
	public static void main(String[] args) throws Exception  {
		
		Statement stat = DBConnection.makeConnection().createStatement();
		ResultSet rst = stat.executeQuery("select * from hr.customer");
		while(rst.next())
		{
			System.out.print(rst.getInt(1) + " ");
			System.out.print(rst.getString(2) + " ");
			System.out.print(rst.getString(3) + " ");
			System.out.println(rst.getInt(4) + " ");    //1,2 is the index of the result in which we want ot retrieve data
		}
		stat.close();
		DBConnection.makeConnection().close();
	}

}
