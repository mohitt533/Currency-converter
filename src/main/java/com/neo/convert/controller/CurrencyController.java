package com.neo.convert.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.convert.model.internal.ExchangeRates;
import com.neo.convert.model.response.*;
import com.neo.convert.service.ExchageRateListService;

@RestController
public class CurrencyController {
	
	@Autowired
	ExchageRateListService exchageRateListService;
	
	@GetMapping("/")
	public List<ExchangeResponse> getExchangeRate() {
		List<ExchangeResponse> exchangeList=new ArrayList<>();
		return exchangeList;
	}
	
	@GetMapping("/exchange")
	public List<ExchangeRates> getExchangeRateList() {
		return exchageRateListService.getExchangeRateList();
	}
}
