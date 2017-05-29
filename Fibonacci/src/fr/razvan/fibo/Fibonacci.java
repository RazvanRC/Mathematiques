package fr.razvan.fibo;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static ArrayList<Integer> fibo (int n) throws FiboException {
		
		ArrayList<Integer> fibo = new ArrayList<>();
		if (n <= 0) {
			throw new FiboException("n < 0");
		}
		fibo.add(0);
		fibo.add(1);
		for (int i = 2; i <= n; i++) {
			fibo.add(i, fibo.get(i - 1) + fibo.get(i - 2));
		}
		return fibo;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Donner un entier");
			int n = sc.nextInt();
			try {
				System.out.println("fibo(" + n + ") = " + fibo(n));
			break;
			} catch (FiboException e) {
				System.out.println(e.getMessage());
			System.out.println("Donnez une valeur supérieure à 0");
			}
		}
		sc.close();

	}
	
}
