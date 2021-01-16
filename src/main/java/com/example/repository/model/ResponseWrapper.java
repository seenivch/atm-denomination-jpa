package com.example.repository.model;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Seenivasan Chandrasekarans
 */
@Service
public class ResponseWrapper {

    private List<Atm> atm;
    private int totalMoneyinATM;

	public int getTotalMoneyinATM() {
		return totalMoneyinATM;
	}

	public ResponseWrapper(){
        this.atm = new ArrayList<>();
    }

    public void setDenominations(Map<String, Integer> denomMap){
                    Atm atm = new Atm(denomMap.get("amount"),denomMap.get("hundreds"),denomMap.get("fiveHundreds"),denomMap.get("twoThousands"));
                    this.atm.add(atm);
    }
    
	public void setTotalMoneyinATM(int totalMoneyinATM) {
		this.totalMoneyinATM = totalMoneyinATM;
	}
    public List<Atm> getDenominations(){
        return atm;
    }

}
