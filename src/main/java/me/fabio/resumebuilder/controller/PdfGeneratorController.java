package me.fabio.resumebuilder.controller;

import java.io.ByteArrayInputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.repository.EducationRepository;
import me.fabio.resumebuilder.repository.ExperienceRepository;
import me.fabio.resumebuilder.repository.ParticipationRepository;
import me.fabio.resumebuilder.repository.ProjectsRepository;
import me.fabio.resumebuilder.repository.ReferencesRepository;
import me.fabio.resumebuilder.util.CvPfdGenerator;
import me.fabio.resumebuilder.util.UserSession;

@Controller
public class PdfGeneratorController {

	@Autowired EducationRepository eduRepo;
	@Autowired ExperienceRepository expRepo;
	@Autowired ParticipationRepository partRepo;
	@Autowired ProjectsRepository proRepo;
	@Autowired ReferencesRepository refRepo;
	
	@RequestMapping(value = "/pdf-generation", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ModelAndView viewPdfScreen(
    		Map<String, Object> model, HttpServletRequest request) {
		
		UserSession session = UserSession.getSession(request);
		//TODO check session value here
        return new ModelAndView("pdf-generation", model);
    }
	
	
	@RequestMapping(value = "/generation", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> generate(HttpServletRequest request) {
		
		UserSession session = UserSession.getSession(request);
		CvPfdGenerator cvPdf = new CvPfdGenerator();
        ByteArrayInputStream bis = cvPdf.generate(prepareUserSession(session));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
	
	private UserSession prepareUserSession(UserSession session) {
		Long userId = session.getUserId();
		session.setEducation(eduRepo.findByUserId(userId));
		session.setExperience(expRepo.findByUserId(userId));
		session.setParticipation(partRepo.findByUserId(userId));
		session.setProject(proRepo.findByUserId(userId));
		session.setReference(refRepo.findByUserId(userId));
		return session;
	}

}
