package me.fabio.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.entity.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {

	Personal findByName(String name);
	
}
