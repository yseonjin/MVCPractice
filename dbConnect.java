package dbconnect;

import java.sql.*;

public class dbConnect {
	private static dbConnect db = new dbConnect();
	private dbConnect() {}
	public static dbConnect getInstance() {
		return db;
	}
	
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			 con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con; 
	}
}
