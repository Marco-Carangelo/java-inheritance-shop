package org.lessons.inheritanceshop;

import java.util.Scanner;

public class Smartphone extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private String smartImei;
	private int smartMemory;
	
	//Costruttore della classe Smartphone
	
	public Smartphone(String prodName, String prodBrand, float prodPrice,int prodIva,String smartImei, int memory){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.smartImei = smartImei;
		this.smartMemory = memory;
		
	}
	
	//Overload del costruttore che non accetta argomenti
	
	public Smartphone(){
		
		
		
	}
	
	
	//Metodi getter e setter
	
	public String getSmartImei() {
		return smartImei;
	}

	public void setSmartImei(String imeiCod) {
		this.smartImei = imeiCod;
	}

	public int getSmartMemory() {
		return smartMemory;
	}

	public void setSmartMemory(int memory) {
		this.smartMemory = memory;
	}
	
	//Override del metodo per popolare il prodotto
	
	@Override
	public void popolaProdotto( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();		
		System.out.print("Inserisci l'IMEI del prodotto: ");
		this.smartImei= scanner.nextLine();
		System.out.print("Inserisci la memoria del prodotto: ");
		this.smartMemory= scanner.nextInt();
	}
	
	
	//Overriding del metodo toString() per stampare i campi dell'oggetto Smartphone
	
		public String toString() {
			
			String prodInfo = super.toString();
			
			String smartInfo = String.format("%s\nCodice IMEI: %s\nMemoria: %d" , prodInfo , smartImei , smartMemory);
			
			return smartInfo;
			
			
		}
	


}
