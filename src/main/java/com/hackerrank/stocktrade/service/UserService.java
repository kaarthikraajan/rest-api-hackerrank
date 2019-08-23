package com.hackerrank.stocktrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerrank.stocktrade.model.User;
import com.hackerrank.stocktrade.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void saveTrade(User user) {
		userRepository.save(user);
	}
}
