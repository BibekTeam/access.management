package com.access.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.access.dao.AccessDAOI;
import com.access.model.Access;

@Service
public class AccessServiceImpl implements AccessServiceI {

	@Autowired
	private AccessDAOI accessDao;

	@Override
	public Access addStudent(Access access) {

		return accessDao.save(access);

	}

	@Override
	public Optional<Access> getById(int id) {

		return accessDao.findById(id);

	}

	@Override
	public void deleteByid(int id) {
		accessDao.deleteById(id);

	}

	@Override
	public void updateStudent(int id, Access access,String username,String studentAccess) {

		Optional<Access> accessUpdate = accessDao.findById(id);
		if (accessUpdate.isPresent())
		access.setUsername(username);
		access.setStudentAccess(studentAccess);
		
		 accessDao.save(access);
	}
}
