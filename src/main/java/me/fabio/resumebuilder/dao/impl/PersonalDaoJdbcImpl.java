package me.fabio.resumebuilder.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import me.fabio.resumebuilder.dao.PersonalDao;
import me.fabio.resumebuilder.entity.Personal;

@Service("personalDao")
public class PersonalDaoJdbcImpl implements PersonalDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void addPersnalDetails(Personal p) {
	}

	@Override
	public Personal getPersonalDetails(int id) {
		return null;
	}

	@Override
	public Collection<Personal> getAllPersons() {
		return null;
	}

}
