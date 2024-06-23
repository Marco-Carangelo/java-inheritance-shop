package org.lessons.inheritanceshop;

import java.util.Scanner;

public class Prodotto {
	
	//Dichiarazione degli attributi della classe
	
	 private int prodCode;
	 private String prodName;
	 private String prodBrand;
	 private float prodPrice;
	 private int prodIva;
	 
	 
	 
	 //Metodo costruttore della classe
	 
	public Prodotto(String prodName,String prodBrand,float prodPrice,int prodIva) {

		//Assegnazione a prodCode di un valore random compreso tra le costanti MIN = 0 e Max = 99999999
			
		final int MIN = 0;
		final int MAX = 99999999;
			
		this.prodCode= shopUtils.randomCodeGenerator(MIN, MAX);
				
			
		//Assegnazione degli altri attributi del metodo
		this.prodName =prodName;
		this.prodBrand=prodBrand;
		this.prodPrice=prodPrice;
		this.prodIva=prodIva;
	}
	
	//Overload del metodo costruttore che non accetta argomenti
	public Prodotto() {

		//Assegnazione a prodCode di un valore random compreso tra le costanti MIN = 0 e Max = 99999999
			
		final int MIN = 0;
		final int MAX = 99999999;
			
		this.prodCode= shopUtils.randomCodeGenerator(MIN, MAX);
		
	}
	

	
	//Metodi Getter e Setter
	
	public String getProdName() {
		return prodName;
	}



	public void setProdName(String prodName) {
		this.prodName = prodName;
	}



	public String getProdBrand() {
		return prodBrand;
	}



	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}



	public float getProdPrice() {
		return prodPrice;
	}



	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}



	public int getProdIva() {
		return prodIva;
	}



	public void setProdIva(int prodIva) {
		this.prodIva = prodIva;
	}



	public int getProdCode() {
		return prodCode;
	}

	
	//Metodo per avere il prezzo + IVA
	
	public float getTaxedPrice( ) {
			
		//Restituiamo il risultato della somma tra il prezzo del prodotto e la percentuale d'IVA
			
		return prodPrice + (prodPrice*prodIva/100);
	}
		
	//Metodo per ottenere il codice completo formato prodcode-nome del prodotto
		
	public String getFullProdName() {
			
		//Dichiariamo una variabile locale che conterrà il nome completo del prodotto
		String fullName = String.format("%08d-%s",getProdCode() ,prodName);
		
		return fullName;
	}
	
	
	//Metodo per popolare il prodotto
	
	public void popolaProdotto("Edge40" , "Motorola" , 250 , 22 ) {
		
		
		System.out.print("Inserisci il nome del prodotto: ");
		this.prodName= scanner.nextLine();
		System.out.print("Inserisci la marca del prodotto: ");
		this.prodBrand= scanner.nextLine();
		System.out.print("Inserisci il prezzo base del prodotto: ");
		this.prodPrice= scanner.nextFloat();
		System.out.print("Inserisci l'IVA applicata al prodotto: ");
		this.prodIva = scanner.nextInt();
		
		scanner.close();
		
	}

	
	
}
