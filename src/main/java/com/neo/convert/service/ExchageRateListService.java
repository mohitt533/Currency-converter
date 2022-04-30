package com.neo.convert.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neo.convert.model.internal.*;
@Service
public class ExchageRateListService {
	
	public List<ExchangeRates> getExchangeRateList(){
		String url="https://api-coding-challenge.neofinancial.com/currency-conversion?seed=77228";
		RestTemplate restTemplate=new RestTemplate();
		ExchangeRates[] exchangeRates=restTemplate.getForObject(url, ExchangeRates[].class);
		
		return Arrays.asList(exchangeRates);
	}
}
