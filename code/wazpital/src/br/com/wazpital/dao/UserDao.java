package br.com.wazpital.dao;

import br.com.wazpital.domain.User;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class UserDao extends AbstractDao {

	public void save(User user) {
		PreparedStatement stmt;
		String sql;
		
		try {
			sql = "INSERT INTO User (name, birthDate, email, password) VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setDate(2, new Date(user.getBirthDate().getTime()));
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());

			stmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(User user) {
		PreparedStatement stmt;
		String sql;
		
		try {
			sql = "UPDATE User SET name = ?, birthDate = ?, email = ?, password = ? WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getName());
			stmt.setDate(2, new Date(user.getBirthDate().getTime()));
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());

			stmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<User> findAll() {
		PreparedStatement stmt;
		ResultSet rs;
		List<User> users;
		String sql;
		
		users = new ArrayList<User>();
		
		try {
			sql = "SELECT * FROM User";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next())
				users.add(new User(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4)));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	public User findBy(int id) {
		PreparedStatement stmt;
		ResultSet rs;
		User user;
		String sql;
		
		user = null;
		
		try {
			sql = "SELECT * FROM User WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 1);
			rs = stmt.executeQuery();
			
			while (rs.next())
				user = new User(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}

	public void delete(User user) {
		PreparedStatement stmt;
		String sql;
		
		try {
			sql = "DELTE FROM User WHERE id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 1);
			stmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void openConnection() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("wazuser");
		dataSource.setPassword("wazpass");
		dataSource.setServerName("wazDB");
		
		try {
			this.conn = dataSource.getConnection();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void closeConnection() {
		try {
			this.conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
