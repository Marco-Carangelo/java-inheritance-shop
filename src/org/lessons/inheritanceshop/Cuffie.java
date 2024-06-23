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
	
	
	//Metodo per popolare il prodotto t
	
	@Override
	public void popolaProdotto() {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();
		
		System.out.print("Inserisci la dimensione del televisore in pollici: ");
		this.hPColor= scanner.nextLine();
		System.out.print("Specificare se si tratta di un televisore smart (true/false): ");
		this.hpWireless= scanner.nextBoolean();
		
		scanner.close();
		
	}
	
	
}
