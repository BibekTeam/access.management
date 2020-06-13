package com.access.service;

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
	public void updateStudent(int id, Access access) {
		Access accessUpdate = accessDao.findById(id).get();
		if (accessUpdate != null) {
			accessDao.deleteById(id);
			accessDao.save(access);
		}
	}

	@Override
	public Access getById(int id) {
		return accessDao.findById(id).get();
	}

	@Override
	public boolean deleteByid(int id) {
		return true;
	}

	}
