package com.neo.convert.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.convert.model.response.ExchangeResponse;
import com.neo.convert.model.internal.*;
@Service
public class BestExchangeRateService {

	@Autowired
	ExchageRateListService exchageRateListService;
	private static Map<String,List<ExchangeNode>> exchangeMap;
	
	public List<ExchangeResponse> getBestExchangeRate(){
		if(exchangeMap==null) {
			getExchangeMap();
		}
		for(Map.Entry<String, List<ExchangeNode>> entry:exchangeMap.entrySet()) {
			System.out.print(entry.getKey()+"\t");
			for(ExchangeNode node:entry.getValue()) {
				System.out.print(node.getCountryCode()+" "+node.getExchangeRate()+" | ");
			}
			System.out.println();
		}
		return getBestExchangePath();
	}

	private List<ExchangeResponse> getBestExchangePath() {
		// TODO Auto-generated method stub
		return null;
	}

	private void getExchangeMap() {
		System.out.println("Here");
		exchangeMap=new HashMap<>();
		for(ExchangeRates exchangeRates:exchageRateListService.getExchangeRateList()) {
			List<ExchangeNode> exchangeNodes;
			if(exchangeMap.containsKey(exchangeRates.getFromCurrencyCode())){
				exchangeNodes=exchangeMap.get(exchangeRates.getFromCurrencyCode());
				
			}else {
				exchangeNodes=new ArrayList<>();;
			}
			exchangeNodes.add(new ExchangeNode(exchangeRates.getToCurrencyCode(),
					exchangeRates.getExchangeRate()));
			exchangeMap.put(exchangeRates.getFromCurrencyCode(),exchangeNodes);
			
			
//			if(exchangeMap.containsKey(exchangeRates.getToCurrencyCode())){
//				exchangeNodes=exchangeMap.get(exchangeRates.getToCurrencyCode());
//				
//			}else {
//				exchangeNodes=new ArrayList<>();;
//			}
//			exchangeNodes.add(new ExchangeNode(exchangeRates.getFromCurrencyCode(),
//					(1/exchangeRates.getExchangeRate())));
//			exchangeMap.put(exchangeRates.getToCurrencyCode(),exchangeNodes);
		}
	}
}
