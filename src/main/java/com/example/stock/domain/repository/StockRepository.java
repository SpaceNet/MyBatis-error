package com.example.stock.domain.repository;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.stock.domain.model.Stock;

@Mapper
@Repository
public interface StockRepository extends CrudRepository<Stock, Integer>{
	default Page<Stock> findPage(Pageable pageable) {
		long total = count();
		List<Stock> content;
		if (total == 0) {
			content = Collections.emptyList();
		} else {
			content = findPg(pageable);
		}
		return new PageImpl<>(content, pageable, total);
	}
	
	List<Stock> findPg(Pageable pageable);
}
