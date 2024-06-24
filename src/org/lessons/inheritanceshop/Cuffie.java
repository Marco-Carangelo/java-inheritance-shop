package org.lessons.inheritanceshop;

import java.util.Scanner;

public class Cuffie extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private String hpColor;
	private boolean hpWireless;
	
	//Costruttore della classe Smartphone
	
	public Cuffie(String prodName, String prodBrand, float prodPrice,int prodIva, String hpColor, boolean hpWireless){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.hpColor = hpColor;
		this.hpWireless = hpWireless;
		
	}
	
	//Overload del costruttore che non accetta argomenti
	
	public Cuffie(){
		
	
	}

	
	//Metodi getter e setter
	public String getHpColor() {
		return hpColor;
	}

	public void setHpColor(String cufColor) {
		this.hpColor = cufColor;
	}

	public boolean isHPWireless() {
		return hpWireless;
	}

	public void setHPWireless(boolean cufWireless) {
		this.hpWireless = cufWireless;
	}
	
	//Override del metodo per popolare il prodotto
	
	@Override
	public void popolaProdotto( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();	
		
		System.out.print("Inserisci il colore del prodotto: ");
		this.hpColor= scanner.nextLine();
		System.out.println("il prodotto è wireless? ");
		this.hpWireless= shopUtils.choiceManager();
	}
	
	//Overriding del metodo toString() per stampare i campi dell'oggetto Cuffie
	
	public String toString() {
		
		String prodInfo = super.toString();
		
		String smartInfo = String.format("%s\nColore: %s\"\nWireless: %b" , prodInfo , hpColor , hpWireless);
		
		return smartInfo;
		
		
	}
	
	
}
