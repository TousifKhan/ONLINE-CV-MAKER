package me.fabio.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.entity.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{

	Experience findByUserId(Long userId);
	
}
