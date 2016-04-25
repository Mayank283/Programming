package Database;

import java.sql.*;

public class testdb {

	public static void main(String[] args) {
		try {

			// Get a Connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library", "root", "Mayank283");

			// Create a statement
			Statement mystmt = myConn.createStatement();

			// Execute SQL Query
			// ResultSet myRs = mystmt.executeQuery("select * from books");
			// String sql="insert into
			// publisher"+"(Coname,City)"+"values('TMH','Cooper')";
			String sql = "delete from publisher where Prfnbr=4";
			mystmt.executeUpdate(sql);
			// Process the result set

			// while(myRs.next()){
			// System.out.println(myRs.getString("Author")+" , "+
			// myRs.getString("Title"));
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}