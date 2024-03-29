package me.fabio.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.entity.Projects;

@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Long>{

	Projects findByUserId(Long userId);
	
}
