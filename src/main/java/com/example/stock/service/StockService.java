package com.example.stock.service;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.stock.domain.model.Stock;

@Service
public interface StockService<ID extends Serializable> {
	public Page<Stock> getPages(Pageable pageable);
}
