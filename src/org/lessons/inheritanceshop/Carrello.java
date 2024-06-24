package org.lessons.inheritanceshop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		//Creiamo un'istanza della classe scanner
		
		Scanner scanner = new Scanner(System.in);
		
		//Creiamo degli arrai vuoti che possano contenere i vari prodotti inseriti
		
		Smartphone smartphones[] = new Smartphone[10];
		Televisore televisori[] = new Televisore[10];
		Cuffie cuffie[] = new Cuffie[10];
		
		//Variabile di controllo per l'uscita dal ciclo while
		boolean scelta = true;
		char userChoice;
		
		//Variabile per la scelta del prodotto da inserire
		byte sceltaProdotto = 0;
		
		
		
		//La parte del programma che si occuperà di acquisire i dati dei prodotti verrà ciclata finchè l'utente deciderà di inserire nuovi prodotti
		
		while(scelta ) {
			
			// Chiediamo all'utente quale prodotto vuole inserire. Se la scelta non è coerente verrà visualizzato un messaggio d'errore per avvisarlo
			
			System.out.print("Scegli il prodotto da inserire. Premi:\n1.Per smartphone\n2.Per televisore\n3.Per Cuffie\n");
			
			sceltaProdotto = scanner.nextByte();
			
			//Inizializziamo fuori dallo switch il contatore che ci servirà per popolare gli array inerenti ai vari prodotti
			int i = 0;
			
			switch(sceltaProdotto) {
				
				//All'interno di ogni Case viene inizializzato un oggetto coerente alla scelta dell'utente e viene invocata la funzione per popolarne i campi
				//Successivamente il riferimento all'oggeto creato viene salvato nella prima posizione che punta a NULL dell'array corrispondente
				case 1:
					
					Smartphone nuovoSmart = new Smartphone();
					nuovoSmart.popolaProdotto();				
					
					do{
						if(smartphones[i] == null) {
							smartphones[i] = nuovoSmart;
						}
						
						i++;
					}
					while(i <smartphones.length && smartphones[i] != null);
					
					break;
					
				case 2:
					
					Televisore nuovoTv = new Televisore();
					nuovoTv.popolaProdotto();				
				
					do{
						if(televisori[i] == null) {
							televisori[i] = nuovoTv;
						}
						
						i++;
					}
					while(i <televisori.length && televisori[i] != null);
					
					break;
					
				case 3:
					
					Cuffie nuoveCuffie = new Cuffie();
					nuoveCuffie.popolaProdotto();				
				
					do{
						if(cuffie[i] == null) {
							cuffie[i] = nuoveCuffie;
						}
						
						i++;
					}
					while(i <cuffie.length && cuffie[i] != null);
					
					break;
					
				default:
					System.out.println("La scelta effettuata non corrisponde a nessun prodotto");
			
			}
			
			//Alla fine del cliclo chiediamo all'utente se vuole inserire un nuovo prodotto o meno
			
			System.out.println("Vuoi inserire un nuovo prodotto?");
			
			scelta = shopUtils.choiceManager();
		}
		
			
		
		
		
		

	}

}
