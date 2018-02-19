package com.example.stock.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.stock.domain.model.Stock;
import com.example.stock.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService<Integer> stockService;
	
	@RequestMapping("/")
	void index(HttpServletResponse response) throws IOException {
	    response.sendRedirect("/stock");
	}
	
	@RequestMapping("/stock")
	public ModelAndView stock(ModelAndView mav) {
		List<Stock> stockList = stockService.getAllItems();
		mav.addObject("stockList", stockList);
		mav.setViewName("stock/search/index");
		return mav;
	}
}
