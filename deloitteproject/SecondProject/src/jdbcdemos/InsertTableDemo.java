package jdbcdemos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableDemo {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.makeConnection();
		Statement statement = connection.createStatement();
		String insertQuery = "insert into hr.customer values(1877,'Bhawna','UP',50000)";
		int rowsAffected =statement.executeUpdate(insertQuery);
		System.out.println("Insert successfully");
		System.out.println(rowsAffected);
	}

}
