package dao;

import java.sql.*;
import dbconnect.dbConnect;
import model.Member;

public class formDao {
	dbConnect db = dbConnect.getInstance();
	
	
	public void insert(Member m) {
	
		Connection con = null;
		PreparedStatement pstmt=null;
		String sql = null;
		
		try {
			con = db.getConnection();
			sql = "insert into mvcmember values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPwd());
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
