package sedmipaket;

import java.util.Scanner;

public class Brasko {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dobrodosli u Brasko++ pametnu kasu!");
		int dan = dani();
		int i = 1;
		int brojpizza = 0;
		do {
			int id;
			double suma = 0;
			String imePizze = "";
			System.out.println("Musterija broj " + i + ":");
			System.out.println("Ukupan broj pizza:" );
			brojpizza = sc.nextInt(); 
			if (brojpizza == -1) {
				System.out.println("Kraj programa!");
				continue;
			}
			for ( int j = 1 ; j <= brojpizza ; j++ ) {
				double cena = 0;
				int danZaPopust = 0;
				System.out.print("Id pizza: ");
				id = sc.nextInt();
				switch (id) {
					case 2 : 
						imePizze = "Cappriciosa";
						cena = 320;
						danZaPopust = 4;
						break;
					case 3 :
						imePizze = "Pepperoni";
						cena = 290;
						break;
					case 5 :
						imePizze = "Vesuvio";
						cena = 310;
						danZaPopust = 2;
						break;
					default : 
						System.out.println("Nepostojeci ID.");
						break;
				}
				System.out.println(imePizze + " " + cena);
				if ( j % 4 == 0 ) System.out.println("Akcija 3+1");
				else {
					suma += cena;
					if ( dan == danZaPopust ) {
						suma -= (cena * 0.1);
						System.out.println("Dnevna 10% " + imePizze + " - " + (cena*0.1) );
					}
				}

			}
			if ( dan == 6 || dan == 7) suma *= 0.85; 
			System.out.println("Racun za musteriju " + i + " je: " + suma);
			i++;
		} while ( brojpizza != -1 );
	}
	static int dani () {
		Scanner sc = new Scanner(System.in);
		String d;
		int dan = 0;
		System.out.print("Koji je danas dan? ");
		d = sc.next();
		switch (d) {
			case "pon" : 
				System.out.println("Ponedeljak. ");
				dan = 1;
				break;
			case "uto" : 
				System.out.println("Utorak. 10% na Vesuvio. "); 
				dan = 2;
				break;
			case "sre" : 
				System.out.println("Sreda. "); 
				dan = 3;
				break;
			case "cet" : 
				System.out.println("Cetvrtak. 10% na Cappriciosa. "); 
				dan = 4;
				break;
			case "pet" : 
				System.out.println("Petak. "); 
				dan = 5;
				break;
			case "sub" :
				System.out.println("Subota. 15% na sve pizze. "); 	
				dan = 6;
				break;
			case "ned" :
				System.out.println("Nedelja. 15% na sve pizze. "); 	
				dan = 7;
				break;
			default :
				System.out.println("Greska u unosu. Pokusajte ponovo. "); 
				dani();
		}
		return dan;
	}
}





