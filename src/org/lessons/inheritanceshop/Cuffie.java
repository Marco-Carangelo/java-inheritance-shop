package org.lessons.inheritanceshop;

import java.util.Scanner;

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
	
	//Overload del costruttore che non accetta argomenti
	
	public Cuffie(){
		
	
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
	
	//Override del metodo per popolare il prodotto
	
	@Override
	public void popolaProdotto( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();	
		
		System.out.print("Inserisci il colore del prodotto: ");
		this.hPColor= scanner.nextLine();
		System.out.println("il prodotto è wireless? ");
		this.hpWireless= shopUtils.choiceManager();
	}
	

	
	
}
