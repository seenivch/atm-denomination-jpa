package com.example.repository.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Seenivasan Chandrasekaran
 */

@Entity(name="ATM")
@Table(name="ATM")
public class Atm {
	
	@Id
	@Column(name="amount")
	private int amount;
	@Column(name="hundreds")
    private int hundreds;
	@Column(name="five_hundreds")
    private int fiveHundreds;
	@Column(name="two_thousands")
    private int twoThousands;

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	public int getFiveHundreds() {
		return fiveHundreds;
	}

	public void setFiveHundreds(int fiveHundreds) {
		this.fiveHundreds = fiveHundreds;
	}

	public int getTwoThousands() {
		return twoThousands;
	}

	public void setTwoThousands(int twoThousands) {
		this.twoThousands = twoThousands;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
    public Atm(int amount,int hundreds,int fiveHundreds,int twoThousands) {
    	this.amount = amount;
        this.hundreds = hundreds;
        this.fiveHundreds = fiveHundreds;
        this.twoThousands = twoThousands;
    }
    public Atm() {
    	this.amount = getAmount();
        this.hundreds = getHundreds();
        this.fiveHundreds = getFiveHundreds();
        this.twoThousands = getTwoThousands();
    }

}
