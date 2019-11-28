package me.fabio.resumebuilder.controller;

import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Experience;
import me.fabio.resumebuilder.entity.Participation;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.entity.Projects;
import me.fabio.resumebuilder.entity.References;
import me.fabio.resumebuilder.entity.User;
import me.fabio.resumebuilder.repository.EducationRepository;
import me.fabio.resumebuilder.repository.ExperienceRepository;
import me.fabio.resumebuilder.repository.ParticipationRepository;
import me.fabio.resumebuilder.repository.PersonalRepository;
import me.fabio.resumebuilder.repository.ProjectsRepository;
import me.fabio.resumebuilder.repository.ReferencesRepository;
import me.fabio.resumebuilder.util.UserSession;

@Controller
public class WelcomeController {
	
	private static final String PERSONAL_VIEW = "personal";
	private static final String LOGIN_VIEW = "welcome";
	
	@Autowired PersonalRepository repo;
	@Autowired EducationRepository eduRepo;
	@Autowired ExperienceRepository expRepo;
	@Autowired ParticipationRepository partRepo;
	@Autowired ProjectsRepository proRepo;
	@Autowired ReferencesRepository refRepo;
	
	@GetMapping("/")
	public ModelAndView welcome(Map<String, Object> model) {
		return new ModelAndView("welcome", "user", new User());
	}
	
	@PostMapping("/login")
    public ModelAndView login(
    		@ModelAttribute("user") User user,
    		HttpServletRequest request) {
        
		System.out.println("username >> " + user.getUsername());
		System.out.println("password >> " + user.getPassword());
		
		Personal p = repo.findByName(user.getUsername());
		if(p != null) {
			UserSession session = UserSession.getSession(request);
			session.setPersonal(p);
			session.setUserId(p.getId());
			return new ModelAndView(PERSONAL_VIEW, PERSONAL_VIEW, p);
		} else {
			return new ModelAndView(LOGIN_VIEW, "user", new User());
		}
    }
	
	
	@GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        
		System.out.println("<< logout >> ");
		UserSession session = UserSession.getSession(request);
		session.clearSession(request);
		return new ModelAndView(LOGIN_VIEW, "user", new User());
    }
	
	@GetMapping("/dispatch")
    public ModelAndView dispatch(
    		@RequestParam String action,
    		HttpServletRequest request) {
        System.out.println("Action => " + action);

        return render(action, request);
    }
	
	private ModelAndView render(String action, HttpServletRequest request) {
		ModelAndView mv = null;
		UserSession session = UserSession.getSession(request);
		Long userId = session.getUserId();
		
		switch(action){
	    	case "personal":
	    		Optional<Personal> optional = repo.findById(userId);
	    		Personal p = optional.isPresent() ? optional.get() : new Personal();
	    		mv = new ModelAndView(action, action, p);
	    	break;
	    	
	    	case "education":
	    		Education edu = eduRepo.findByUserId(userId);
	    		edu = (edu != null) ? edu : new Education();
	    		mv = new ModelAndView(action, action, edu);
	    	break;
	    	
	    	case "experience":
	    		Experience exp = expRepo.findByUserId(userId);
	    		exp = (exp != null) ? exp : new Experience();
	    		mv = new ModelAndView(action, action, exp);
	    	break;
	    	
	    	case "participation":
	    		Participation part = partRepo.findByUserId(userId);
	    		part = part != null ? part : new Participation();
	    		mv = new ModelAndView(action, action, part);
	    	break;
	    	
	    	case "project":
	    		Projects pro = proRepo.findByUserId(userId);
	    		pro = pro != null ? pro : new Projects();
	    		mv = new ModelAndView(action, action, pro);
	    	break;
	    	
	    	case "reference":
	    		References ref = refRepo.findByUserId(userId);
	    		ref = ref != null ? ref : new References();
	    		mv = new ModelAndView(action, action, ref);
	    	break;
	    }
		
		return mv;
	}
	
}
