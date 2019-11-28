package me.fabio.resumebuilder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import me.fabio.resumebuilder.dao.UserDao;

@Service("userService")
public class UserService {

	@Autowired 
	@Qualifier("userDao")
	private UserDao dao;
	
//	public Collection<User> getAllEmployees() {
//		return dao.getAllEmployees();
//	}
//	
//	public User getEmployeeById(int id) {
//		return dao.getEmployeeById(id);
//	}
//	
//	public void insertEmployee(User e){
//		dao.insertEmployee(e);
//	}
//	
//	public void deleteEmployee(String empId){
//		dao.removeEmployee(empId);
//	}
//	
//	public void updateEmployee(User e){
//		dao.upateEmployee(e);
//	}
	
}
