package org.lessons.inheritanceshop;

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
			
		this.prodCode= ProdUtils.randomCodeGenerator(MIN, MAX);
				
			
		//Assegnazione degli altri attributi del metodo
		this.prodName =prodName;
		this.prodBrand=prodBrand;
		this.prodPrice=prodPrice;
		this.prodIva=prodIva;
	}

	
	
}
