package com.example.stock.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.stock.domain.model.Stock;

@Service
public interface StockService<ID extends Serializable> {
	public Stock getItems(ID id);
	public List<Stock> getAllItems();
}
