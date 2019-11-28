package me.fabio.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fabio.resumebuilder.entity.Participation;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, Long> {

	Participation findByUserId(Long userId);
	
}
