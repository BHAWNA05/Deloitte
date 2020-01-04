package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExerciseJdbc {

	public static void main(String[] args) throws SQLException {
		Customer customer = new Customer();
		customer.accept();
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement = connection.prepareStatement("update hr.customer set customerName=?, customerAddress=?, billAmount =? where customerId=?");
		statement.setString(1, customer.getCustomerName());
		statement.setString(2, customer.getCustomerAddress());
		statement.setInt(3, customer.getBillAmount());
		statement.setInt(4, customer.getCustomerId());
		statement.executeUpdate();
		System.out.println( customer.getCustomerId() + "Updated successfully");
	
}
}
