package fr.razvan.maths;


import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac Comb2.java
 *  Execution:    java Comb2 n k
 *  
 *  Enumerates all subsets of size k on n elements.
 *
 *  % java Comb2 5 3
 *  0 1 2 
 *  0 1 3 
 *  0 1 4 
 *  0 2 3 
 *  0 2 4 
 *  0 3 4 
 *  1 2 3 
 *  1 2 4 
 *  1 3 4 
 *  2 3 4 
 *
 ******************************************************************************/

public class Comb2 {

    private static void showCombination(int[] s) {
        for (int i = 0; i < s.length; i++)
        	System.out.print(s[i] + " ");
        System.out.println();
    }

    public static void generate(int[] s, int position, int nextInt, int k, int n) {
        if (position == k) {
            showCombination(s);
            return;
        }
        for (int i = nextInt; i < n; i++) {
            s[position] = i;
            generate(s, position + 1, i + 1, k, n);
        }
    }  

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n;
        int k;
        System.out.println("Introduire n: ");
        n = sc.nextInt();
        System.out.println("Introduire k: ");
        k = sc.nextInt();
        sc.close();

        int[] s = new int[k];
        generate(s, 0, 0, k, n);
    }
}
