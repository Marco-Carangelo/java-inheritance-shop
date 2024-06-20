package org.lessons.inheritanceshop;

public class Smartphone extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private String imeiCod;
	private int memory;
	
	//Costruttore della classe Smartphone
	
	public Smartphone(String prodName, String prodBrand, float prodPrice,int prodIva,String imeiCod, int memory){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.imeiCod = imeiCod;
		this.memory = memory;
		
	}

}
