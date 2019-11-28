package me.fabio.resumebuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.repository.PersonalRepository;

@SpringBootApplication
public class OnlineCVMakerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired PersonalRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineCVMakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting -> {}", repository.save(new Personal("fabio", "siracusa", "M", "10-10-1994", 32, "909989898")));
		logger.info("All users -> {}", repository.findById(1L));
	}
}
