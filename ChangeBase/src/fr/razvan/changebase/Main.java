package fr.razvan.changebase;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int base = 0;
		String numeroBase;
		System.out.println("Introduire un numero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduire la base de transformation: ");
		base = sc.nextInt();
		sc.close();
		
		numeroBase = ChangeBase.changeBase(numero1, base);
		System.out.println("Le numero '" + numero1 + "' transformé en base '" + base + "' a la valeur: '" + numeroBase + "'.");
		
	}

}
