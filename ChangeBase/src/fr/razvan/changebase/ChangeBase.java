package fr.razvan.changebase;

import fr.razvan.string.InversString;

public class ChangeBase {
	
public static String changeBase (int numero, int base) {
		
		int reste;
		int quotient;
		String noReste = "";
		String noInv = "";
		String temp = "";
		do {
			reste = numero % base;
			quotient = numero / base;
			numero = quotient;
			temp = intToString(reste);			
			noReste += temp;			
		} while (quotient >= base);			
		temp = intToString(quotient);
		noReste += temp;

		noInv = InversString.inverserString(noReste).toString();
		
		return noInv;
	}

	private static String intToString(int reste){
		String ret = "";
		if(reste <= 9){
			ret = String.valueOf(reste);
		}else{				
			reste += 55;
			ret = String.valueOf(((char)reste));
		}
		return ret;
	}

}
