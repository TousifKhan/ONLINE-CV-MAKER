package me.fabio.resumebuilder.util;

import org.springframework.web.servlet.ModelAndView;

import me.fabio.resumebuilder.entity.Achievements;
import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Experience;
import me.fabio.resumebuilder.entity.Participation;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.entity.Projects;
import me.fabio.resumebuilder.entity.References;

public abstract class Util {

	public static ModelAndView forward(String action){
		ModelAndView mv = null;
        switch(action){
        
        	case "personal":
        		mv = new ModelAndView(action, action, new Personal());
        	break;
        	
        	case "education":
        		mv = new ModelAndView(action, action, new Education());
        	break;
        	
        	case "experience":
        		mv = new ModelAndView(action, action, new Experience());
        	break;
        	
        	case "participation":
        		mv = new ModelAndView(action, action, new Participation());
        	break;
        	
        	case "project":
        		mv = new ModelAndView(action, action, new Projects());
        	break;
        	
        	case "reference":
        		mv = new ModelAndView(action, action, new References());
        	break;
        	
        	case "achievement":
        		mv = new ModelAndView(action, action, new Achievements());
        	break;
        	
        }
        
        return mv;
	}
	
}
