package org.lessons.inheritanceshop;

import java.util.Scanner;

public class shopUtils {
	
	//Metodo per generare un numero random tra un valore minimo ed un massimo
	
	static public int randomCodeGenerator( int min, int max) {
				
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	
	//Metodo per gestire una tra due valore inserendo S per Sì ed N per No
	
	static public boolean choiceManager() {
		
		boolean choice = false;
		char userChoice = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(userChoice != 's' && userChoice != 'n') {
			
			System.out.println("Premere S per Sì o N per No");
			
			userChoice = scanner.next().toLowerCase().charAt(0);	
			
				if(userChoice == 's') {
					
					choice = true;
					
				}else if(userChoice == 'n') {
					
					choice = false;
					
					}else {
						
						System.out.println("Il valore inserito non è valido");
						
					}
			}
		return choice;
	}
	
		

}
