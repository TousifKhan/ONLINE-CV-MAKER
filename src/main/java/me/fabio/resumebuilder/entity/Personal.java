package me.fabio.resumebuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal_details")
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(name="father_name")
	private String fatherName;

	@Column(name="sex")
	private String gender;
	private String dob;
	private int age;
	
	@Column(name="contact")
	private String mobileNo;
	
	@Column(name="marital_status")
	private String maritalStatus;
	@Column(nullable=true, name="address")
	private String address;
	
	@Column(name="email_id")
	private String emailId;

	@Column(name="langauge_proficiencies")
	private String langaugeProf;
	
	@Column(name="mother_name")
	private String motherName;
	private String nationality;
	
	@Column(name="career_objectives")
	private String careerObjectives;
	private String strength;
	private String hobbies;
	
	public Personal(){
		super();
	}
	
	public Personal(String name, String fatherName, String gender) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.gender = gender;
	}
	
	public Personal(String name, String fatherName, String gender, String dob, int age, String mobileNo) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCareerObjectives() {
		return careerObjectives;
	}

	public void setCareerObjectives(String careerObjectives) {
		this.careerObjectives = careerObjectives;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public String getLangaugeProf() {
		return langaugeProf;
	}

	public void setLangaugeProf(String langaugeProf) {
		this.langaugeProf = langaugeProf;
	}
	
}
