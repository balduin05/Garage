package oop_ereditarieta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		int scelta;
		int dim;
		int posti;
		Veicoli garage;
		
		do {
			System.out.print("Inserire la dimensione del programma: ");
			dim = keyboard.nextInt();
			keyboard.nextLine();
			
		}while((dim < 0) || (dim > 40));
		
		garage = new Veicoli(dim);
		
		
		// MENU:
		
		do {
			System.out.println();
			System.out.println(" - MENU - ");
			System.out.println("1) Inserimento automobili");
			System.out.println("2) Inserimento motociclette");
			System.out.println("3) Inserimento furgoni");
			System.out.println("4) Visualizza veicoli");
			System.out.println("5) Elimina veicolo");
			System.out.println("6) Esci dal programma");
			System.out.println();
			System.out.print("Opzione scelta: ");
			scelta = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(scelta) {
			
			case 1:
				garage.inserimento_automobile();
				break;
				
			case 2:
				garage.inserimento_motociclette();
				break;
				
			case 3:
				garage.inserimento_furgoni();
				break;
				
			case 4:
				garage.visualizza_automobili();
				break;
				
			case 5:
				int posto;
				
				if(garage.veicoli_inseriti > 0) {
					System.out.print("Inserire il posto in cui il veicolo è parcheggiato: ");
					posto = keyboard.nextInt();
					keyboard.nextLine();
					
					garage.elimina_veicolo(posto);
					
				}else {
					System.out.println("Errore: il programma è vuoto!");
					 
				}
				
				break;
				
			}
			
		}while(scelta != 6);
		
	}

}
