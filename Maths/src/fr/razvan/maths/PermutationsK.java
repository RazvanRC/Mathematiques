package fr.razvan.maths;

import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac PermutationsK.java
 *  Execution:    java PermutationsK n k
 *  
 *  Enumerates all permutations of size k chosen from n elements.
 *
 *  % java PermutationsK 4 2 | sort
 *  ab
 *  ac
 *  ad
 *  ba 
 *  bc
 *  bd
 *  ca
 *  cb
 *  cd
 *  da
 *  db 
 *  dc 
 *
 *  Limitations
 *  -----------
 *    *  Assumes n <= 52
 *
 ******************************************************************************/

public class PermutationsK {

    public static void choose(char[] a, int k) {
        enumerate(a, a.length, k);
    }

    private static void enumerate(char[] a, int n, int k) {
        if (k == 0) {
            for (int i = n; i < a.length; i++)
            	System.out.print(a[i]);
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            enumerate(a, n-1, k-1);
            swap(a, i, n-1);
        }
    }  

    // helper function that swaps a[i] and a[j]
    public static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    // sample client
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int k;
        System.out.println("Introduire n: ");
        n = sc.nextInt();
        System.out.println("Introduire k: ");
        k = sc.nextInt();
        sc.close();
        String elements = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = elements.charAt(i);
        choose(a, k);
    }

}
