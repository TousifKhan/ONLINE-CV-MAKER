package me.fabio.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
	
	Education findByUserId(Long userId);

}
