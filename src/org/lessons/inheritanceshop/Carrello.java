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
		
		//Inizializziamo tre contatori per gli array appena creati
		
		int smartIndex = 0;
		int tvIndex = 0;
		int hpIndex = 0;
		
		
		//Variabile di controllo per l'uscita dal ciclo while
		boolean scelta = true;
		
		//Variabile per la scelta del prodotto da inserire
		byte sceltaProdotto = 0;
		
		
		
		//La parte del programma che si occuperà di acquisire i dati dei prodotti verrà ciclata finchè l'utente deciderà di inserire nuovi prodotti
		
		while(scelta ) {
			
			// Chiediamo all'utente quale prodotto vuole inserire. Se la scelta non è coerente verrà visualizzato un messaggio d'errore per avvisarlo
			
			System.out.print("Scegli il prodotto da inserire. Premi:\n1.Per smartphone\n2.Per televisore\n3.Per Cuffie\n");
			
			sceltaProdotto = scanner.nextByte();
			
			switch(sceltaProdotto) {
				
				//All'interno di ogni Case viene inizializzato un oggetto coerente alla scelta dell'utente e viene invocata la funzione per popolarne i campi
				//Successivamente il riferimento all'oggeto creato viene salvato nella prima posizione che punta a NULL dell'array corrispondente
				//Infine viene incrementato l'indice di quello specifico array
				case 1:
					
					Smartphone nuovoSmart = new Smartphone();
					
					nuovoSmart.popolaProdotto();
					
					smartphones[smartIndex] = nuovoSmart;				
					
					smartIndex++;
					
					break;
					
				case 2:
					
					Televisore nuovoTv = new Televisore();
					
					nuovoTv.popolaProdotto();
					
					televisori[tvIndex] = nuovoTv;				
					
					tvIndex++;
					
					break;
					
				case 3:
					
					Cuffie nuoveCuffie = new Cuffie();
					
					nuoveCuffie.popolaProdotto();
					
					cuffie[hpIndex] = nuoveCuffie;				
					
					hpIndex++;
					
					break;
					
				default:
					System.out.println("La scelta effettuata non corrisponde a nessun prodotto");
			
			}
			
			//Alla fine del cliclo chiediamo all'utente se vuole inserire un nuovo prodotto o meno
			
			System.out.println("Vuoi inserire un nuovo prodotto?\n");
			
			scelta = shopUtils.choiceManager();
		}
		
		scanner.close();
			
		//Stampa degli array con gli oggetti corrispondenti
		
		//Stampa Smartphones
		
		System.out.println("********************************************\n");
		System.out.println("Prodotti di tipo Smartphone nel carrello:\n");
		
		int i = 0;
		while (smartphones[i] != null) {
			
			System.out.println(smartphones[i].toString());
			
			i++;
		}
		
		//Stampa Televisori
		
			System.out.println("********************************************\n");
			System.out.println("Prodotti di tipo Televisore nel carrello:\n");
			
			i = 0;
			while (televisori[i] != null) {
				
				System.out.println(televisori[i].toString());
				
				i++;
			}
			
				
		//Stampa Cuffie
		
		System.out.println("\n********************************************\n");
		System.out.println("Prodotti di tipo Cuffie nel carrello:\n");
		
		i = 0;
		while (cuffie[i] != null) {
			
			System.out.println(cuffie[i].toString());
			
			i++;
		}
		

	}

}
