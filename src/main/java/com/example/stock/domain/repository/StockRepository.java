package com.example.stock.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.stock.domain.model.Stock;

@Mapper
@Repository
public interface StockRepository {
		
	long countByFinished(boolean finished);
    Stock findOne(Integer id);
	
	List<Stock> findAllLimit();
}
