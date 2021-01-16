package com.example.repository.repository;


import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.repository.model.Atm;


/**
 * @author Seenivasan Chandrasekaran
 */
@Repository
public interface AtmJpaRepository extends CrudRepository<Atm, Integer> {
	
//	@Query("select amount,hundreds,fiveHundreds,twoThousands from ATM")
	List<Atm> findAll();
	
}