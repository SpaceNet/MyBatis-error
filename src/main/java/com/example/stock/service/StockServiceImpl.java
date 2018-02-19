package com.example.stock.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.stock.domain.model.Stock;
import com.example.stock.domain.repository.StockRepository;

@Service
@Transactional
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository stockRepository;
	
	public Stock getItems(Serializable id){
		return stockRepository.findOne(11);
	}
	public List<Stock> getAllItems(){
		return stockRepository.findAllLimit();
	}
}
