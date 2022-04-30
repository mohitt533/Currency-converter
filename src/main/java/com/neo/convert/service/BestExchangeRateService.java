package com.neo.convert.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.neo.convert.model.response.ExchangeResponse;
import com.neo.convert.model.internal.*;

public class BestExchangeRateService {

	@Autowired
	ExchageRateListService exchageRateListService;
	private static Map<String,ExchangeNode> exchangeMap;
	
	public List<ExchangeResponse> getBestExchangeRate(){
		if(exchangeMap==null)
		exchangeMap=getExchangeMap();
		
		return getBestExchangePath();
	}

	private List<ExchangeResponse> getBestExchangePath() {
		// TODO Auto-generated method stub
		return null;
	}

	private Map<String, ExchangeNode> getExchangeMap() {
		// TODO Auto-generated method stub
		return null;
	}
}
