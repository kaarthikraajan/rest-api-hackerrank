package com.hackerrank.stocktrade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.model.User;
import com.hackerrank.stocktrade.repository.TradeRepository;
import com.hackerrank.stocktrade.repository.UserRepository;

@Service
public class TradeService {

	@Autowired
	TradeRepository tradeRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public void saveTrade(Trade trade) {
		tradeRepository.save(trade);
	}
	
	public void deleteStocksById(Long id) {
		tradeRepository.delete(id);
	}

	public void deleteUserById(long id) {
		userRepository.delete(id);
	}
	
	public Trade findStockById(Long id_stock) {
		return tradeRepository.findOne(id_stock);
	}
	
	public User findUserById(Long id_stock) {
		return userRepository.findOne(id_stock);
	}

	public List<User> findAllUser() {
		return userRepository.findAll();
	}
	
	public List<Trade> findAllTrade() {
		return tradeRepository.findAll();
	}

}
