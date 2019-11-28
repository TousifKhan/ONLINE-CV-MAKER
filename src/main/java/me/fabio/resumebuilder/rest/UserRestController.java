package me.fabio.resumebuilder.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.fabio.resumebuilder.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired UserService service;
	
	@RequestMapping("/")
	public String welcome(){
		return "Tousif Khan";
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public Collection<User> getAllEmployees() {
//		return service.getAllEmployees();
//	}
//	
//	@CrossOrigin
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ResponseEntity<User> getEmployeeById(@PathVariable("id") int id){
//        try
//        {
//        	User tempUser = service.getEmployeeById(id);
//            return new ResponseEntity<User>(tempUser, HttpStatus.OK);
//        }
//        catch (Exception ex){
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//
//    }
	
}
