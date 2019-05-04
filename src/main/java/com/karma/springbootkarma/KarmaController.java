package com.karma.springbootkarma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KarmaController {
   	private KarmaRepository repo;
    @Autowired
	public KarmaController(KarmaRepository repo) {
		this.repo = repo;
	}
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET,value="/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
    	List<Employee> empList = repo.findAll();
    	
    	return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.POST,value="/newEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
    	Employee emp = repo.save(employee);
    	return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
    }
    
}
