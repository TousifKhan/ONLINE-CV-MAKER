package me.fabio.resumebuilder.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.dao.UserDao;
import me.fabio.resumebuilder.entity.User;

@Repository("userDao")
public class JdbcUserDao implements UserDao {

	@Autowired JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings("unused")
	private static class EmployeeRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int update) throws SQLException {
			return new User(
//					rs.getInt(1) , 
//					rs.getString(2), 
//					rs.getDouble(4)
				);
		}
		
	}
	
	@Override
	public void upateUser(User e) {
	}

	@Override
	public void insertUser(User e) {
	}

	@Override
	public User getUserById(int id) {
		return null;
	}

}
