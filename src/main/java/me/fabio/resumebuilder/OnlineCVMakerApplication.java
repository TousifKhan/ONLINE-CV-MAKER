package me.fabio.resumebuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.repository.EducationRepository;
import me.fabio.resumebuilder.repository.PersonalRepository;

@SpringBootApplication
public class OnlineCVMakerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired PersonalRepository repository;
	@Autowired EducationRepository educaionRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineCVMakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		logger.info("Personal id -> {}", repository.findById(10001L));

//		logger.info("Inserting -> {}", repository.save(new Personal("Ramiz Khan", "Zahir Khan", "M")));
		
//		logger.info("Inserting -> {}", educaionRepo.save(new Education(1, "SSBT College, Jalgaon", "B.E.")));
//		repository.deleteById(10002L);

//		logger.info("All users -> {}", educaionRepo.findByUserId(2));
	}
}
