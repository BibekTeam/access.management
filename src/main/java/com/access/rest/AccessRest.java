package com.access.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public Access addStudent(@RequestBody Access access) {

		return accessService.addStudent(access);

	}

	@GetMapping("/findStudent/{id}")
	public Optional<Access> findById(@PathVariable int id) {

		return accessService.getById(id);

	}

//	@PostMapping("/addStudent")
//	public ResponseEntity<?>  addStudent(@RequestBody Access access) {
//		
//		 accessService.addStudent(access);
//		 return ResponseEntity.ok("Added in the DB");
//	}
//	
//	@GetMapping("/findStudent/{id}")
//	public ResponseEntity<?> findById(@PathVariable int id ) {
//		
//		 accessService.getById(id);
//		 return ResponseEntity.ok("Retrived From DB ");
//		
//	}

	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<?> deleteByid(@PathVariable int id) {

		accessService.deleteByid(id);
		return ResponseEntity.ok("Deleted From DB ");
	}

	@PutMapping("/updateStudent/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable("id") int id, @RequestBody Access access, String username,
			String studentAccess) {

		accessService.updateStudent(id, access, username, studentAccess);

		return ResponseEntity.ok("Updated in DB ");
	}
}
