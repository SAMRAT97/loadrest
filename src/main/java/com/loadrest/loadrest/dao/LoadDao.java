package com.loadrest.loadrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.loadrest.loadrest.entities.Load;

public interface LoadDao extends JpaRepository<Load, Long> {

	
@Query("select u from Load u where u.shipperId = :c")
public List<Load>getLoadByShipperIDUsingJPQL(@Param("c") long shipperId);
	 

}
