package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDelete {
	public static void main(String[] args) throws SQLException {
		
	
	ProductDetails productDetails = new ProductDetails();
	productDetails.acceptOnly();
	Connection connection = DBConnection.makeConnection();
  Statement stat = DBConnection.makeConnection().createStatement();
  PreparedStatement statement1 = connection.prepareStatement("delete from hr.product where productId = ?");
	statement1.setInt(1, productDetails.getProductId());
	statement1.executeUpdate();
	System.out.println("Record Deleted successfully");
	stat.close();
	DBConnection.makeConnection().close();
}
	
}