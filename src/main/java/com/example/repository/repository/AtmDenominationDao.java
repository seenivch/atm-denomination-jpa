package com.example.repository.repository;


import org.hibernate.cache.spi.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.repository.model.Atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.transaction.Transactional;

/**
 * @author Seenivasan Chandrasekaran
 */
@Service
@Validated
public class AtmDenominationDao {
	
	@Autowired
	private AtmJpaRepository atmJpaRepository;

	 public Map<String,int[]> getValuesFromDB(){
    	 List<Atm> atm = getAllValues();
    	 Map<String,int[]> dataMap = new HashMap<String,int[]>();
    	 if((Objects.nonNull(atm))&& (atm.size()!=0)) {
    		 int hundred[] = new int[atm.size()];
    		 for (int i = 0; i< atm.size(); i++) {
    			 hundred[i] = atm.get(i).getHundreds();
    		 }
    		 int fiveHundred[] = new int[atm.size()];
    		 for (int i = 0; i< atm.size(); i++) {
    			 fiveHundred[i] = atm.get(i).getFiveHundreds();
    		 }
    		 int twoThousand[] = new int[atm.size()];
    		 for (int i = 0; i< atm.size(); i++) {
    			 twoThousand[i] = atm.get(i).getTwoThousands();
    		 }
    		 dataMap.put("hundred", hundred);
    		 dataMap.put("fiveHundred", fiveHundred);
    		 dataMap.put("twoThousand", twoThousand);
    	 }
    	 return dataMap;
    }

	@Transactional
	private List<Atm> getAllValues() {
		List<Atm> atm = new ArrayList<Atm>();
		atmJpaRepository.findAll().forEach(data->atm.add(data));
		return atm;
	}
}
