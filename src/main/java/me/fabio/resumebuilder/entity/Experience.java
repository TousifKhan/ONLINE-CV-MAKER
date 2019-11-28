package me.fabio.resumebuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experience")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="user_id")
	private Long userId;
	
	private String employer;
	private String designation;
	
	@Column(name="joining_date")
	private String joiningDate;
	
	@Column(name="leaving_date")
	private String leavingDate;
	
	@Column(name="work")
	private String working;
	
	@Column(name="year_of_exp")
	private String yearOfExp;
	
	public Experience(){}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getEmployer() {
		return employer;
	}
	
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getJoiningDate() {
		return joiningDate;
	}
	
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	public String getLeavingDate() {
		return leavingDate;
	}
	
	public void setLeavingDate(String leavingDate) {
		this.leavingDate = leavingDate;
	}
	
	public String getWorking() {
		return working;
	}
	
	public void setWorking(String working) {
		this.working = working;
	}

	public String getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(String yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	
}
