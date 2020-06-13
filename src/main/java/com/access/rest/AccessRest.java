package com.access.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.access.model.Access;
import com.access.service.AccessServiceI;

@RestController
public class AccessRest {

	@Autowired
	private AccessServiceI accessService;

	@PostMapping("/addStudent")
	public Access addStudent(@RequestBody Access access) {

		return accessService.addStudent(access);

	}

	@GetMapping("/getStudentById/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {
		Access access = accessService.getById(id);
		return new ResponseEntity<Access>(access, HttpStatus.OK);
	}

}
