package com.example.stock.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
    @RequestMapping(value="/stock", method=RequestMethod.GET)
	public String getPage(Model model, Pageable pageable) {
		Page<Stock> stocksPage = stockService.getPages(pageable);
		System.out.println(stocksPage);
//        PageWrapper<Stock> page = new PageWrapper<Stock>(stocksPage, "/stock");
//		System.out.println(page);
		model.addAttribute("stockList", stocksPage.getContent());
//        model.addAttribute("page", page);
    		return "stock";
    }
}
