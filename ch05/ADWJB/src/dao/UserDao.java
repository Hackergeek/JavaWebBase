package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vo.User;
import dbc.JdbcUtil;

public class UserDao {
	// 向数据库中添加用户记录的方法add()
	public void add(User user) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into user values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserid());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getSex());
			ps.executeUpdate();
		} finally {
			JdbcUtil.free(null, ps, conn);
		}
	}

	// 修改数据库用户记录的方法update()
	public void update(User user) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "update user set username=?,sex=? where userid=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getSex());
			ps.setString(3, user.getUserid());
			ps.executeUpdate();
		} finally {
			JdbcUtil.free(null, ps, conn);
		}
	}

	// 删除数据库用户记录的方法delete()
	public void delete(String userId) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "delete from user where userid=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.executeUpdate();
		} finally {
			JdbcUtil.free(null, ps, conn);
		}
	}

	// 根据id查询用户的方法findUserById
	public User findUserById(String userId) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select * from user where userid=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setUserid(rs.getString(1));
				user.setUsername(rs.getString(2));
				user.setSex(rs.getString(3));
			}
		} finally {
			JdbcUtil.free(rs, ps, conn);
		}
		return user;
	}

	// 查询全部用户的方法queryAll()
	public List<User> queryAll() throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> userList = new ArrayList<User>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select * from user";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getString(1));
				user.setUsername(rs.getString(2));
				user.setSex(rs.getString(3));
				userList.add(user);
			}
		} finally {
			JdbcUtil.free(rs, ps, conn);
		}
		return userList;
	}
}
