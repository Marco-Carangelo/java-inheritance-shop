package org.lessons.inheritanceshop;

public class Main {

	public static void main(String[] args) {
		
		//Creazione di un'istannza della classe Smartphone e stampa di prova di metodi e attributi
		
		Smartphone newCell = new Smartphone("Edge40" , "Motorola" , 250 , 22, "1234567890123456" , 128);
		
		newCell.popolaProdotto();
		
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
		
		
		
		
		
		
		//Creazione di un'istannza della classe Televisore e stampa di prova di metodi e attributi
		
		Televisore newTv = new Televisore("BohTV" , "Samsung" , 500 , 22 ,(byte) 52 , true);
		
		//Dichiariamo una variabile che useremo per visualizzare se il televisore è smart oppure no in forma più leggibile
		String isSmart;
		
		//Verifichiamo il valore della variabile telSmart, se vero daremo ad isSmart valroe "Sì", altrimenti valore "No"
		if (newTv.isTelSmart()) {
			isSmart = "Sì";
		}else {
			isSmart = "No";
		}
				
		System.out.println("\n\n\nCaratteristiche Televisore: ");
		System.out.println("Nome: " + newTv.getProdName());
		System.out.println("Marca: " + newTv.getProdBrand());
		System.out.printf("Prezzo base: %.2f €\n", newTv.getProdPrice());
		System.out.println("Iva applicata: " + newTv.getProdIva());
		System.out.println("Dimensione in pollici: " + newTv.getTelSize() + "\"");
		System.out.println("SmartTV: " + isSmart);
		System.out.printf("Prezzo + IVA: %.2f €\n", newTv.getTaxedPrice());
		System.out.println("Codice numerico: " + newTv.getProdCode());
		System.out.println("Codice completo: " + newTv.getFullProdName());
		
		
		
		
		//Creazione di un'istannza della classe Cuffie e stampa di prova di metodi e attributi
		
		Cuffie newHeadPhones = new Cuffie("HD-619" , "AKG" , 200 , 22 , "Verde" , false);
				
		//Dichiariamo una variabile che useremo per visualizzare se le cuffie sono wireless o cablate in forma più leggibile
		String areWireless;
		
		//Verifichiamo il valore della variabile hpWireless, se vero daremo a areWireless il valore "Wireless", altrimenti valore "Cablate"
		if (newHeadPhones.isHPWireless()) {
			areWireless = "Wireless";
		}else {
			areWireless = "Cablate";
		}
				
		System.out.println("\n\n\nCaratteristiche delle Cuffie: ");
		System.out.println("Nome: " + newHeadPhones.getProdName());
		System.out.println("Marca: " + newHeadPhones.getProdBrand());
		System.out.printf("Prezzo base: %.2f €\n", newHeadPhones.getProdPrice());
		System.out.println("Iva applicata: " + newHeadPhones.getProdIva());
		System.out.println("Colore: " + newHeadPhones.getHPColor() + "\"");
		System.out.println("Wireless/Cablate: " + areWireless);
		System.out.printf("Prezzo + IVA: %.2f €\n", newHeadPhones.getTaxedPrice());
		System.out.println("Codice numerico: " + newHeadPhones.getProdCode());
		System.out.println("Codice completo: " + newHeadPhones.getFullProdName());
		

	}

}
