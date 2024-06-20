package org.lessons.inheritanceshop;

public class Televisore extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private byte telSize;
	private boolean telSmart;
	
	//Costruttore della classe Smartphone
	
	public Televisore(String prodName, String prodBrand, float prodPrice,int prodIva,byte telSize, boolean telSmart){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.telSize = telSize;
		this.telSmart = telSmart;
		
	}
}
