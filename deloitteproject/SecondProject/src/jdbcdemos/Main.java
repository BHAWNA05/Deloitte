package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String[] args) throws SQLException {
		Customer customer = new Customer();
		customer.accept();
		Connection connection = DBConnection.makeConnection();
		/*PreparedStatement statement = connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
		statement.setInt(1, customer.getCustomerId());
		statement.setString(2, customer.getCustomerName());
		statement.setString(3, customer.getCustomerAddress());
		statement.setInt(4, customer.getBillAmount());
		statement.executeUpdate();*/
		Statement stmt =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("SELECT hr.customer.* FROM hr.customer");
		System.out.println( rs.getInt(1) +"      "+rs.getString(2)+"      "+rs.getString(3)+"     "+rs.getInt(4));
		rs.moveToInsertRow();
	    rs.updateInt("customerId", 105);
	    rs.updateString("customerName", "Geeta");
	    rs.updateString("customerAddress", "Pune");
	    rs.updateInt("billAmount", 38000);
	    rs.insertRow();
	    //rs.absolute(2); 
	      //rs.updateString(105,"Geetha"); 
	    //rs.updateRow(); 
	 
	 //rs.beforeFirst();     
		System.out.println(customer.getCustomerName()+ " , your record saved successfully");
		stmt.close();
		connection.close();
	}

}
