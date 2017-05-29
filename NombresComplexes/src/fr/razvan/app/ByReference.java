package fr.razvan.app;
/*
 * Copyright (C) 2012 W. Patrick Hooper <wphooper@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 * Demonstrate that java objects are passed by reference. Also, we observe the
 * headaches that mutable objects can cause.
 * 
 * The class just stores a single integer value.
 * 
 * @author W. Patrick Hooper <wphooper@gmail.com>
 * @version 1
 */
public class ByReference {
    /** Stored value.*/
    private int i;
    
    /** Construct a new ByReference object with a given initial value. */
    public ByReference(int value) {
        i=value;
    }
    
    /** Return the value of this object.*/
    public int getValue(){
        return i;
    }
    
    /** Increases the value of this object by one. */
    public void increment() {
        i=i+1;
    }

    @Override
    public String toString() {
        return "ByReference{" + "i = " + i + '}';
    }

    
    
    public static void main(String[] args) {
        ByReference a= new ByReference(0);
        ByReference b= new ByReference(a.getValue());
        System.out.println("First, a = " + a + " and b = " + b + ".");
        a.increment();
        System.out.println("After incrementing a, a = " + a + " and b = " + b + ".");
        b.increment();
        System.out.println("After incrementing b, a = " + a + " and b = " + b + ".");
    }
}
