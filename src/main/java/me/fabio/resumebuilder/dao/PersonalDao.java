package me.fabio.resumebuilder.dao;

import java.util.Collection;

import me.fabio.resumebuilder.entity.Personal;

public interface PersonalDao {

	void addPersnalDetails(Personal p);
	Personal getPersonalDetails(int id);
	Collection<Personal> getAllPersons();
}
