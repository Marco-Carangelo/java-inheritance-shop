package org.lessons.inheritanceshop;

public class Cuffie extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private String hPColor;
	private boolean hpWireless;
	
	//Costruttore della classe Smartphone
	
	public Cuffie(String prodName, String prodBrand, float prodPrice,int prodIva, String hPColor, boolean hpWireless){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.hPColor = hPColor;
		this.hpWireless = hpWireless;
		
	}

	
	//Metodi getter e setter
	public String getHPColor() {
		return hPColor;
	}

	public void setHPColor(String cufColor) {
		this.hPColor = cufColor;
	}

	public boolean isHPWireless() {
		return hpWireless;
	}

	public void setHPWireless(boolean cufWireless) {
		this.hpWireless = cufWireless;
	}
	
	
	
	
	
}
