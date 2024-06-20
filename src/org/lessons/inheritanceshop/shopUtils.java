package org.lessons.inheritanceshop;

public class shopUtils {
	
	//Metodo per generare un numero random tra un valore minimo ed un massimo
	
		static public int randomCodeGenerator( int min, int max) {
					
			return (int) (Math.random() * (max - min + 1)) + min;
		}
		

}
