package org.lessons.inheritanceshop;

import java.util.Scanner;

public class Televisore extends Prodotto {
	
	//Attributi della classe Smartphone
	
	private byte tvSize;
	private boolean tvSmart;
	
	//Costruttore della classe Smartphone
	
	public Televisore(String prodName, String prodBrand, float prodPrice,int prodIva,byte tvSize, boolean tvSmart){
		
		super(prodName,prodBrand,prodPrice,prodIva);
		
		this.tvSize = tvSize;
		this.tvSmart = tvSmart;
		
	}
	
	//Overload del costruttore che non accetta argomenti
	
	public Televisore(){
		
		
	}
	
	//Metodi getters e setters

	public byte getTvSize() {
		return tvSize;
	}

	public void setTvSize(byte telSize) {
		this.tvSize = telSize;
	}

	public boolean isTvSmart() {
		return tvSmart;
	}

	public void setTvSmart(boolean telSmart) {
		this.tvSmart = telSmart;
	}
	
	//Override del metodo per popolare il prodotto
	
	@Override
	public void popolaProdotto( ) {
		
		Scanner scanner = new Scanner(System.in);
		
		super.popolaProdotto();	
		
		System.out.print("Inserisci la dimensione dello schermo in pollici: ");
		this.tvSize= scanner.nextByte();
		System.out.println("il prodotto è smart?");
		this.tvSmart= shopUtils.choiceManager();
	}

	//Overriding del metodo toString() per stampare i campi dell'oggetto Televisore
	
	public String toString() {
		
		String prodInfo = super.toString();
		
		String telInfo = String.format("%s\nDimensioni dello schermo: %s\"\nSmart TV: %b\n" , prodInfo , tvSize , tvSmart);
		
		return telInfo;
		
		
	}
}
