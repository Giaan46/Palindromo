package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  palabra;
		char[] palindromo;
		int izq , der;

		System.out.println("Introduce una palabra : ");
		palabra = sc.nextLine();
		palabra = palabra.toUpperCase(Locale.ROOT);
		palindromo = palabra.toCharArray();
		  izq = 0;
		  der = palindromo.length - 1;

		  while(izq < der){
		  	if(palindromo[izq] == palindromo[der]){
		  		der--;
		  		izq++;

			}else{
		  		System.out.println(false);
		  		break;
			}
		  }
		if (izq == der) {
			System.out.println(true);
		}



	}
}






