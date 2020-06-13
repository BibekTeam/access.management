package com.access.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.access.model.Access;
import com.access.service.AccessServiceI;

@RestController
public class AccessRest {

	@Autowired
	private AccessServiceI accessService;

	@PostMapping("/addStudent")
	public ResponseEntity<?> addStudent(@RequestBody Access access) {
		accessService.addStudent(access);
		return ResponseEntity.ok("Added in the DB");
	}

	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable("id") int id, @RequestBody Access access) {
		accessService.updateStudent(id, access);
		return ResponseEntity.ok("Updated in DB ");
	}

	@GetMapping("/getStudentById/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {
		Access access = accessService.getById(id);
		return new ResponseEntity<Access>(access, HttpStatus.OK);
	}

	@PostMapping("/deleteStudent/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") int id) {
		boolean isDelete = accessService.deleteById(id);
		return new ResponseEntity<Boolean>(isDelete, HttpStatus.OK);
	}

}
