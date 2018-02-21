package com.example.stock.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.stock.domain.model.Stock;
import com.example.stock.domain.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public Page<Stock> getPages(Pageable pageable){
		return stockRepository.findPage(pageable);
	}
}
