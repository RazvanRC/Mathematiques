package fr.razvan.convertisseurbyte;


public class ConvertisseurByte {
	
	public static final long KILO = 1024;
	public static final long MEGA = 1024 * KILO;
	public static final long GIGA = 1024 * MEGA;
	public static final long TERA = 1024 * GIGA;
	public static final long PETA = 1024 * TERA;
	public static final long ETA = 1024 * PETA;
	
	
	/*
	 * valeur - valeur en octets de du numero introduit
	 */
	public static double convertir(Double valeur, String unite) {

		
		if(valeur.isNaN()) {
			System.out.println("Entrez un nombre SVP!!");
		} else {
			
			if (unite.equals("Ko")){
				valeur = valeur * KILO;
			} else {
				if (unite.equals("Mo")) {
					valeur = valeur * MEGA;
				} else {
					if (unite.equals("Go")) {
						valeur = valeur * GIGA;
					} else {
						if (unite.equals("To")) {
							valeur = valeur * TERA;
						} else {
							if (unite.equals("Po")) {
								valeur = valeur * PETA;
							} else {
								if (unite.equals("Eo")) {
									valeur = valeur * ETA;
								}
							}
						}
					}
				}
			}
		}
			
		return valeur;	
			
	}
	
	public void aff() {
		
	}
	
	public static void affichage (Double numeroConverti) {
		
		System.out.println(numeroConverti + "  octets");
		System.out.println(numeroConverti / KILO + "  Ko ou KB");
		System.out.println(numeroConverti / (MEGA) + "  Mo ou MB");
		System.out.println(numeroConverti / (GIGA) + "  Go ou GB");
		System.out.println(numeroConverti / (TERA) + "  To ou TB");
		System.out.println(numeroConverti / (PETA) + "  Po ou PB");
		System.out.println(numeroConverti / (ETA) + "  Eo ou EB");
		
	}

	public static void convertisseurByte(Double numeroAConvertir, String multiples) {
		affichage(convertir(numeroAConvertir, multiples));
	}
}
