package me.fabio.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.entity.References;

@Repository
public interface ReferencesRepository  extends JpaRepository<References, Long>{

	References findByUserId(Long userId);
	
}
