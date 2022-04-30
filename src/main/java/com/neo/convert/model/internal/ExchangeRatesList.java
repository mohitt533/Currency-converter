package com.neo.convert.model.internal;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRatesList {
	private List<ExchangeRates> exchangeRateList;

    public ExchangeRatesList() {
    	exchangeRateList = new ArrayList<>();
    }
    
    public List<ExchangeRates> getExchangeRateList() {
		return exchangeRateList;
	}

	public void setExchangeRateList(List<ExchangeRates> exchangeRateList) {
		this.exchangeRateList = exchangeRateList;
	}

}
