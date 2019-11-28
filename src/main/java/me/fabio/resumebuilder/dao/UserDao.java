package me.fabio.resumebuilder.dao;

import me.fabio.resumebuilder.entity.User;

public interface UserDao {

	User getUserById(int id);

	void upateUser(User u);

	void insertUser(User u);

}
