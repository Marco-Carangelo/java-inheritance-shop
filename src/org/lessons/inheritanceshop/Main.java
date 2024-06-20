package org.lessons.inheritanceshop;

public class Main {

	public static void main(String[] args) {
		
		Smartphone newCell = new Smartphone("Edge 40" , "Motorola" , 250 , 22 , "1234567890123456" , 128);
		
		System.out.println("Caratteristiche smartphone: ");
		System.out.println("Nome: " + newCell.getProdName());
		System.out.println("Marca: " + newCell.getProdBrand());
		System.out.printf("Prezzo base: %.2f €\n", newCell.getProdPrice());
		System.out.println("Iva applicata: " + newCell.getProdIva());
		System.out.println("Codice IMEI: " + newCell.getImeiCod());
		System.out.println("Capacità di memoria: " + newCell.getMemory());
		System.out.printf("Prezzo + IVA: %.2f €\n", newCell.getTaxedPrice());
		System.out.println("Codice numerico: " + newCell.getProdCode());
		System.out.println("Codice completo: " + newCell.getFullProdName());
		
		
		
		

	}

}
