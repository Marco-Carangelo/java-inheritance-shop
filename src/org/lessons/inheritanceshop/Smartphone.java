package org.lessons.inheritanceshop;

import java.util.Scanner;

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
	
	//Overload del costruttore che non accetta argomenti
	
	public Smartphone(){
		
		
		
	}
	
	
	//Metodi getter e setter
	
	public String getImeiCod() {
		return imeiCod;
	}

	public void setImeiCod(String imeiCod) {
		this.imeiCod = imeiCod;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	//Override del metodo per popolare il prodotto
	
	@Override
	public void popolaProdotto( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();		
		System.out.print("Inserisci l'IMEI del prodotto: ");
		this.imeiCod= scanner.nextLine();
		System.out.print("Inserisci la memoria del prodotto: ");
		this.memory= scanner.nextInt();
	}
	


}
