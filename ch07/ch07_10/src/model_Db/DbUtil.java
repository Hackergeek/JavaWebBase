package model_Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtil {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//设计对数据库记录变更的方法，其中查询SQL语句作为方法的形参
	public int updateSQL(String sql) {
		int n = -1;
		try {
			con = DbConnection.getDBconnection();
			pstmt = con.prepareStatement(sql);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			DbConnection.closeDB(con, pstmt, rs);
			e.printStackTrace();
		}
		return n;
	}
	
	public ResultSet QuerySQL(String sql) {
		try {
			con = DbConnection.getDBconnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			return rs;
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
