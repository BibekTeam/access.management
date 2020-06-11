package com.access.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.access.model.Access;


@Repository
public interface AccessDAOI extends JpaRepository <Access, Integer> {


	

}
