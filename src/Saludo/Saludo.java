package Saludo;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
	
		System.out.println("Buenos días Ceinmark, soy Diego");
		System.out.println("Introduce un numero para saber si es primo o no:");

		Scanner ent = new Scanner(System.in);
		int num = 0;
		
		num = Integer.parseInt(ent.nextLine());
	}

}
