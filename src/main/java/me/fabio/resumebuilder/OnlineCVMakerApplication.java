package me.fabio.resumebuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import me.fabio.resumebuilder.repository.PersonalRepository;

@SpringBootApplication
public class OnlineCVMakerApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired PersonalRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineCVMakerApplication.class, args);
	}
	
//	@Bean
//	public MessageSource messageSource() {
//	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//	    messageSource.setBasename("classpath:messages");
//	    //messageSource.setBasenames("messages/label");
//	    messageSource.setCacheSeconds(10); //reload messages every 10 seconds
//	    return messageSource;
//	}
	
//	@Bean
//	public ResourceBundleMessageSource messageSource() {
//	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//	    messageSource.addBasenames("classpath:messages/label");
//	    return messageSource;
//	}
	
//	@Bean("messageSource")
//	public MessageSource messageSource() {
//		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//	    messageSource.setBasename("classpath:locale/messages");
//	    messageSource.setDefaultEncoding("UTF-8");
//	    messageSource.setUseCodeAsDefaultMessage(true);
//	    return messageSource;
//	}
//
//	@Bean
//	public LocaleResolver localeResolver() {
//		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
//		return localeResolver;
//	}
	
	@Override
	public void run(String... args) throws Exception {
//		logger.info("Inserting -> {}", repository.save(new Personal("fabio", "siracusa", "M", "10-10-1994", 32, "909989898")));
//		logger.info("All users -> {}", repository.findById(1L));
	}
}
