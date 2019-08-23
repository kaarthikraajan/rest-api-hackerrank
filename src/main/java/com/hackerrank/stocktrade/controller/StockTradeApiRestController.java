package com.hackerrank.stocktrade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.model.User;
import com.hackerrank.stocktrade.service.TradeService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class StockTradeApiRestController {

	@Autowired
	TradeService tradeService;

	@PostMapping("/trades")
	public ResponseEntity<String> saveTrade(@RequestBody Trade trade) {
		if (trade != null) {
			tradeService.saveTrade(trade);
			return new ResponseEntity<String>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/stocks/{id_stock}")
	public ResponseEntity<String> deleteStocksById(@PathVariable long id_stock) {
		tradeService.deleteStocksById(id_stock);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping("/stocks/{id_stock}/trades")
	public Trade getStocks(@PathVariable long id_stock) {
		return tradeService.findStockById(id_stock);
	}

	@GetMapping("/users/{id}/trades")
	public User getUsersById(@PathVariable long id_stock) {
		return tradeService.findUserById(id_stock);
	}
	
	@GetMapping("/stocks")
	public List<Trade> getStocks() {
		return tradeService.findAllTrade();
	}

	@GetMapping("/trades")
	public List<User> getUsers() {
		return tradeService.findAllUser();
	}

}
