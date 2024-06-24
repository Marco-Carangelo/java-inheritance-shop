package org.lessons.inheritanceshop;

import java.util.Scanner;

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
	
	//Override del metodo per popolare il prodotto
	
	@Override
	public void popolaProdotto( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();	
		
		System.out.print("Inserisci la dimensione dello schermo in pollici: ");
		this.telSize= scanner.nextByte();
		System.out.println("il prodotto è smart?");
		this.telSmart= shopUtils.choiceManager();
	}

	
}
