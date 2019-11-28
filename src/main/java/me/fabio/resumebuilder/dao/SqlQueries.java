package me.fabio.resumebuilder.dao;

public interface SqlQueries {

	String ADD_PERSONALS = "insert into personal_details (name, father_name, sex, dob, age, contact, marital_status, address, email_id, language_proficiencies, mother_name, nationality, career_objectives, strength, hobbies) "
			+ "values ()";
}
