package com.access.service;

import java.util.Optional;

import com.access.model.Access;

public interface AccessServiceI {
	
	public Access addStudent(Access access);
	
	public Access getById(int id);
	
	public void deleteByid(int id);
	
	public void updateStudent(int id, Access access,String username,String studentAccess);


}
