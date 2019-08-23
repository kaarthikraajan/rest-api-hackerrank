package com.hackerrank.stocktrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackerrank.stocktrade.model.Trade;


@Repository
public interface TradeRepository extends JpaRepository<Trade, Long>{


}
