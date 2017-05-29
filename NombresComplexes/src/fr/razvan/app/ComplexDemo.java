package fr.razvan.app;
/*
 * This work by W. Patrick Hooper is free of known copyright restrictions.
 * The work is in the public domain.
 * 
 * Author's website: <a href="http://wphooper.com">http://wphooper.com</a>. 
 */

import fr.razvan.modele.Complex;

// This allows us to use the Complex numbers class we created.


/** This class was created to demonstrate the use of the Complex Numbers class.
 *
 * @author W. Patrick Hooper
 */
public class ComplexDemo {

    /** This is the function called when the demo is run. 
     * We will not use the command line arguments.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // First lets build two complex numbers.
        Complex a = new Complex(14.2,2.9), b = new Complex(7.5,2.1);
        
        // Lets tell the user what these numbers are.
        System.out.println("I created two complex numbers: a = "+a+" and b = "+b+".");
        
        // Now lets convince the user that we can do some mathematics.
        System.out.println("The absolute values of these numbers are |a| = "+a.abs()+" and |b| = "+b.abs()+".");
        System.out.println("The sum of these numbers is a + b = "+a.add(b)+".");
        System.out.println("The difference between these numbers is a - b = "+a.minus(b)+".");
        System.out.println("The product of these numbers is a * b = "+a.mult(b)+".");
        System.out.println("The ratio of these numbers is a / b ="+a.div(b)+".");         
        System.out.println("Here is a sanity check (b / a) * a - b = "+b.div(a).mult(a).minus(b) +".");        
        
        Complex z = Complex.fromPolar(1,2 * Math.PI / 7);
        System.out.println("A primitive 7th root of unity is " + z + ".");
    }

}
