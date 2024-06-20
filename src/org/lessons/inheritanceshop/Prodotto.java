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

	
	

	
	
}
