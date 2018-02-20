package com.example.stock.domain.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.domain.model.Stock;

@Mapper
@Repository
public interface StockRepository extends CrudRepository<Stock, Integer>{
	Page<Stock> findPg(Pageable pageable);
}
