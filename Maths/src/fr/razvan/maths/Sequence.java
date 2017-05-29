package fr.razvan.maths;


import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac Sequence.java
 *  Execution:    java Sequence a b
 *
 *  Determine minimum number of +1 and x2 operations needed to transform
 *  a into b.
 *
 *  % java Sequence 5 23
 *  23 = ((5 * 2 + 1) * 2 + 1)
 *
 *  % java Sequence 11 113
 *  113 = ((((11 + 1) + 1) + 1) * 2 * 2 * 2 + 1)
 *
 *
 ******************************************************************************/

public class Sequence { 

    public static String show(int a, int b) {
        if      (a == b)     return "" + a;
        else if (b % 2 != 0) return "(" + show(a, b-1) + " + 1)";
        else if (b < 2 * a)  return "(" + show(a, b-1) + " + 1)";
        else                 return show(a, b/2) + " * 2";
    }


    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduire a: ");
        a = sc.nextInt();
        System.out.println("Introduire b: ");
        b = sc.nextInt();
        sc.close();
        if (a <= b) System.out.println(b + " = " + show(a, b));
        else        System.out.println("Error: second argument is less than first one");
    }

}
