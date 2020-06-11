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
	public Access getById(int id) {

		return null;

	}

	@Override
	public void deleteByid(int id) {

	}

	@Override
	public void updateStudent(int id, Access access, String username, String studentAccess) {

	}
}
