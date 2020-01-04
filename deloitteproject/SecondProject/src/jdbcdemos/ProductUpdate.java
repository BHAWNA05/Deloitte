package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdate {
public static void main(String[] args) throws SQLException {
	ProductDetails productDetails = new ProductDetails();
	productDetails.accept();
	Connection connection = DBConnection.makeConnection();
	//Statement stat = DBConnection.makeConnection().createStatement();
	PreparedStatement statement2 = connection.prepareStatement("update hr.product set productName=?, price=?, qoh =? where productId=?");
	statement2.setString(1, productDetails.getProductName());
	statement2.setInt(2, productDetails.getPrice());
	statement2.setInt(3, productDetails.getQoh());
	statement2.setInt(4, productDetails.getProductId());
	statement2.executeUpdate();
	System.out.println("Record updated successfully");
	
	DBConnection.makeConnection().close();
}
}
