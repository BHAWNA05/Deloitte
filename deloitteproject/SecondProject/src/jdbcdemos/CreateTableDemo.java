package jdbcdemos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcdemos.DBConnection;

public class CreateTableDemo {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.makeConnection();
		Statement statement = connection.createStatement();
		String query = "create table hr.salary(salary integer , bonus integer)";
		String query1 = "drop table hr.salary";
		statement.execute(query);
		System.out.println("Done");
		
	}

}
