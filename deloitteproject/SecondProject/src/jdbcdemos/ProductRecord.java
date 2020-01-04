package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductRecord {
	public static void main(String[] args) throws SQLException {
		
	

	ProductDetails productDetails = new ProductDetails();
	productDetails.accept();
	Connection connection = DBConnection.makeConnection();
  Statement stat = DBConnection.makeConnection().createStatement();
//	ResultSet rst = stat.executeQuery("select * from hr.product");
//	while(rst.next())
//	{
//		System.out.print(rst.getInt(1) + " ");
//		System.out.print(rst.getString(2) + " ");
//		System.out.print(rst.getInt(3) + " ");
//		System.out.println(rst.getInt(4) + " ");    //1,2 is the index of the result in which we want ot retrieve data
//	}
	PreparedStatement statement = connection.prepareStatement("insert into hr.product values(?,?,?,?)"); //insert the data into table
	statement.setInt(1, productDetails.getProductId());
	statement.setString(2, productDetails.getProductName());
	statement.setInt(3, productDetails.getPrice());
	statement.setInt(4, productDetails.getQoh());
	statement.executeUpdate();
	System.out.println( " record inserted successfully");
	ResultSet rst = stat.executeQuery("select * from hr.product"); // display all the data in the table
	while(rst.next())
	{
		System.out.print(rst.getInt(1) + " ");
		System.out.print(rst.getString(2) + " ");
		System.out.print(rst.getInt(3) + " ");
		System.out.println(rst.getInt(4) + " ");    //1,2 is the index of the result in which we want ot retrieve data
	}
	
	
	
	stat.close();
	DBConnection.makeConnection().close();
}
}
