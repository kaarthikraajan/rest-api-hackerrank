package com.hackerrank.stocktrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackerrank.stocktrade.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
