package org.lessons.inheritanceshop;

public class Cuffie extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private String cufColor;
	private boolean cufWireless;
	
	//Costruttore della classe Smartphone
	
	public Cuffie(String prodName, String prodBrand, float prodPrice,int prodIva, String cufColor, boolean cufWireless){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.cufColor = cufColor;
		this.cufWireless = cufWireless;
		
	}
	
	
	
}
