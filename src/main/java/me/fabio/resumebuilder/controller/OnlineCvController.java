package me.fabio.resumebuilder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Experience;
import me.fabio.resumebuilder.entity.Participation;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.entity.Projects;
import me.fabio.resumebuilder.entity.References;
import me.fabio.resumebuilder.repository.EducationRepository;
import me.fabio.resumebuilder.repository.ExperienceRepository;
import me.fabio.resumebuilder.repository.ParticipationRepository;
import me.fabio.resumebuilder.repository.PersonalRepository;
import me.fabio.resumebuilder.repository.ProjectsRepository;
import me.fabio.resumebuilder.repository.ReferencesRepository;
import me.fabio.resumebuilder.util.UserSession;
import me.fabio.resumebuilder.util.Util;

@Controller
@RequestMapping("/cv")
public class OnlineCvController {
	
	private static final String PERSONAL_VIEW = "personal";
	private static final String EDUCATION_VIEW = "education";
	private static final String EXPERIENCE_VIEW = "experience";
	private static final String PARTICIPATION_VIEW = "participation";
	private static final String PROJECT_VIEW = "project";
	private static final String REFERENCE_VIEW = "reference";
	private static final String ACHIEVEMENT_VIEW = "achievement";
	private static final String PDF_VIEW = "pdf-generation";
	
	@Autowired PersonalRepository repo;
	@Autowired EducationRepository eduRepo;
	@Autowired ExperienceRepository expRepo;
	@Autowired ParticipationRepository partRepo;
	@Autowired ProjectsRepository proRepo;
	@Autowired ReferencesRepository refRepo;
	
	@PostMapping("/personal/add")
    public ModelAndView addPersonalDetails(
    		@ModelAttribute("personal") Personal p,
    		HttpServletRequest request) {
		
		System.out.println(">> addPersonalDetails <<");
		
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		if(userId != null) {
			System.out.println("setting ID");
			p.setId(userId);
		}
		
		System.out.println("New Personal Entity");
		p = repo.save(p);
		
		if(p!= null){
			session.setPersonal(p);
			session.setUserId(p.getId());
		}
		
		Education edu = eduRepo.findByUserId(userId);
		if(edu != null) {
			session.setEducation(edu);
			return new ModelAndView(EDUCATION_VIEW, EDUCATION_VIEW, edu);
		} else {
			return Util.forward(EDUCATION_VIEW);
		}
    }
	
	@PostMapping("/education/add")
    public ModelAndView addEducationDetails(
    		@ModelAttribute("education") Education edu,
    		HttpServletRequest request) {
		
		System.out.println(">> addEducationDetails <<");
		
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		edu.setUserId(userId);
		
		Education e = session.getEducation();
		if(e != null) {
			edu.setId(e.getId());
		}
		edu = eduRepo.save(edu);
		session.setEducation(edu);
		
		Experience exp = expRepo.findByUserId(userId);
		if(exp != null){
			session.setExperience(exp);
			return new ModelAndView(EXPERIENCE_VIEW, EXPERIENCE_VIEW, exp);
		}
		
		return Util.forward(EXPERIENCE_VIEW);
    }
	
	
	@PostMapping("/experience/add")
    public ModelAndView addExperienceDetails(
    		@ModelAttribute("experience") Experience exp,
    		HttpServletRequest request) {
		
		System.out.println(">> addExperienceDetails <<");
		
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		exp.setUserId(userId);
		
		Experience e = session.getExperience();
		if(e != null) {
			exp.setId(e.getId());
		}
		
		exp = expRepo.save(exp);
		session.setExperience(exp);
		
		//load participation from that userId
		Participation p = partRepo.findByUserId(userId);
		if(p != null){
			session.setParticipation(p);
			return new ModelAndView(PARTICIPATION_VIEW, PARTICIPATION_VIEW, p);
		}
		
		return Util.forward(PARTICIPATION_VIEW);
    }
	
	@PostMapping("/participation/add")
    public ModelAndView addParticipationDetails(
    		@ModelAttribute("participation") Participation part,
    		HttpServletRequest request) {
		
		System.out.println(">> addParticipationDetails <<");
		
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		part.setUserId(userId);
		
		Participation p = session.getParticipation();
		if(p != null) {
			part.setId(p.getId());
		}
		
		part = partRepo.save(part);
		session.setParticipation(part);
		
		Projects pro = proRepo.findByUserId(userId);
		if(pro != null){
			session.setProject(pro);
			return new ModelAndView(PROJECT_VIEW, PROJECT_VIEW, pro);
		}
		
		return Util.forward(PROJECT_VIEW);
    }
	
	@PostMapping("/project/add")
    public ModelAndView addProjectDetails(
    		@ModelAttribute("project") Projects project,
    		HttpServletRequest request) {
		
		System.out.println(">> addProjectDetails <<");
		
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		project.setUserId(userId);
		
		Projects pro = session.getProject();
		if(pro != null) {
			project.setId(pro.getId());
		}
		
		project = proRepo.save(project);
		session.setProject(project);
		
		References ref = refRepo.findByUserId(userId);
		if(ref != null){
			session.setReference(ref);
			return new ModelAndView(REFERENCE_VIEW, REFERENCE_VIEW, ref);
		}
		
		return Util.forward(REFERENCE_VIEW);
    }
	
	@PostMapping("/reference/add")
    public ModelAndView addReferencesDetails(
    		@ModelAttribute("reference") References ref,
    		HttpServletRequest request) {
		
		System.out.println(">> addReferencesDetails <<");
		
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		ref.setUserId(userId);
		
		References r = session.getReference();
		if(r != null) {
			ref.setId(r.getId());
		}
		
		ref = refRepo.save(ref);
		session.setReference(ref);
		
		if(ref != null){
			session.setReference(ref);
		}
		
		return new ModelAndView(PDF_VIEW);
    }
	
}
