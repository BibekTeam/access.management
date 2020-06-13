package com.access.service;

import com.access.model.Access;

public interface AccessServiceI {
	
	public Access addStudent(Access access);

	public Access getById(int id);

	public void updateStudent(int id, Access access);

	public boolean deleteById(int id);

}
