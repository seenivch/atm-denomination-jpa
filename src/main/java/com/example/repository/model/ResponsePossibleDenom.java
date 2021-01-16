package com.example.repository.model;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Seenivasan Chandrasekarans
 */
@Service
public class ResponsePossibleDenom {

    private int totalMoneyinATM;

    private String invalidAmount;
    
    private String sufficientMoney;
    
    private List<Atm> atm;

	public String getSufficientMoney() {
		return sufficientMoney;
	}

	public int getTotalMoneyinATM() {
		return totalMoneyinATM;
	}

    public String getInvalidAmount() {
		return invalidAmount;
	}

    public void setTotalMoneyinATM(int totalMoneyinATM) {
		this.totalMoneyinATM = totalMoneyinATM;
	}

    public void setInvalidAmount(String invalidAmount) {
		this.invalidAmount = invalidAmount;
	}
    public void setSufficientMoney(String sufficientMoney) {
		this.sufficientMoney = sufficientMoney;
	}
    public ResponsePossibleDenom(){
        this.atm = new ArrayList<>();
    }

    public void setDenominations(Map<String, Integer> denomMap){
                    Atm atm = new Atm(denomMap.get("amount"),denomMap.get("hundreds"),denomMap.get("fiveHundreds"),denomMap.get("twoThousands"));
                    this.atm.add(atm);
    }
    public List<Atm> getDenominations(){
        return atm;
    }

}
