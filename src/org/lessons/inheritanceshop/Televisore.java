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
	
	//Overload del costruttore che non accetta argomenti
	
	public Televisore(){
		
		
	}
	
	//Metodi getters e setters

	public byte getTelSize() {
		return telSize;
	}

	public void setTelSize(byte telSize) {
		this.telSize = telSize;
	}

	public boolean isTelSmart() {
		return telSmart;
	}

	public void setTelSmart(boolean telSmart) {
		this.telSmart = telSmart;
	}
	
	
}
