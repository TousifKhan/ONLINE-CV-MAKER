package me.fabio.resumebuilder.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import me.fabio.resumebuilder.entity.Education;
import me.fabio.resumebuilder.entity.Experience;
import me.fabio.resumebuilder.entity.Participation;
import me.fabio.resumebuilder.entity.Personal;
import me.fabio.resumebuilder.entity.Projects;
import me.fabio.resumebuilder.entity.References;

public class UserSession {
	
	private Long userId;
	
	private Personal personal;
	private Education education;
	private Experience experience;
	private Participation participation;
	private Projects project;
	private References reference;
	
	private static UserSession session;
	
	private UserSession(){}
	
	public static UserSession getSession(HttpServletRequest request){
		if(session == null) {
			session = new UserSession();
		}
		return session;
	}

	public void clearSession(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("user");
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Participation getParticipation() {
		return participation;
	}

	public void setParticipation(Participation participation) {
		this.participation = participation;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	public References getReference() {
		return reference;
	}

	public void setReference(References reference) {
		this.reference = reference;
	}
	
}
