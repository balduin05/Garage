package oop_ereditarieta;

import java.util.Scanner;

public class Veicoli {

	Scanner keyboard = new Scanner(System.in);

	// ATTRIBUTI:

	int dim;
	int veicoli_inseriti;
	private Veicolo_a_motore vM[];


	// COSTRUTTORE DEFAULT:

	public Veicoli() {
		this.dim = 0;
		this.veicoli_inseriti = 0;
		vM = new Veicolo_a_motore[dim];

	}


	// COSTRUTTORE CON PARAMETRI:

	public Veicoli(int dim) {
		this.dim = dim;
		this.veicoli_inseriti = 0;
		vM = new Veicolo_a_motore[dim];

	}


	// INSERIMENTO VEICOLI:

	public void inserimento_automobile() {
		if(veicoli_inseriti < dim) {
			Automobile a = new Automobile();

			System.out.println();
			System.out.println("Inserire automobile " + (veicoli_inseriti + 1) + ": ");
			System.out.println();
			a.inserimento();

			System.out.println();
			System.out.print("Posti liberi: ");
			visualizza_posti_vuoti();
			int posto;


			do {
				System.out.println();
				System.out.print("Dove vuoi parcheggiare la macchina? ");
				posto = keyboard.nextInt();
				keyboard.nextLine();

				if(vM[posto - 1] != null) {
					System.out.println("Errore: posto già occupato!");

				}
			}while(vM[posto - 1] != null);


			vM[posto - 1] = a;
			veicoli_inseriti ++;

		}else {
			System.out.println("Errore: il programma è PIENO!");

		}
	}


	// INSERIMENTO MOTOCICLETTE:

	public void inserimento_motociclette() {
		if(veicoli_inseriti < dim) {
			Motocicletta m = new Motocicletta();

			System.out.println();
			System.out.println("Inserire motocicletta " + (veicoli_inseriti + 1) + ": ");
			System.out.println();
			m.inserimento();

			System.out.println();
			System.out.print("Posti liberi: ");
			visualizza_posti_vuoti();
			int posto;


			do {
				System.out.println();
				System.out.print("Dove vuoi parcheggiare la motocicletta? ");
				posto = keyboard.nextInt();
				keyboard.nextLine();

				if(vM[posto - 1] != null) {
					System.out.println("Errore: posto già occupato!");

				}
			}while(vM[posto - 1] != null);

			vM[posto - 1] = m;
			veicoli_inseriti ++;

		}else {
			System.out.println("Errore: il programma è PIENO!");

		}
	}


	// INSERIMENTO FURGONI:

	public void inserimento_furgoni() {
		if(veicoli_inseriti < dim) {
			Furgone f = new Furgone();

			System.out.println();
			System.out.println("Inserire furgone " + (veicoli_inseriti + 1) + ": ");
			System.out.println();
			f.inserimento();

			System.out.println();
			System.out.print("Posti liberi: ");
			visualizza_posti_vuoti();
			int posto;


			do {
				System.out.println();
				System.out.print("Dove vuoi parcheggiare il furgone? ");
				posto = keyboard.nextInt();
				keyboard.nextLine();

				if(vM[posto - 1] != null) {
					System.out.println("Errore: posto già occupato!");

				}
			}while(vM[posto - 1] != null);

			vM[posto - 1] = f;
			veicoli_inseriti ++;

		}else {
			System.out.println("Errore: il programma è PIENO!");

		}
	}


	// VISUALIZZA POSTI LIBERI:

	public void visualizza_posti_vuoti() {
		for(int i = 0; i < dim; i++) {
			if(vM[i] == null) {
				System.out.print(i + 1 + " ");

			}
		}
	}


	// VISUALIZZA VEICOLI:

	public void visualizza_automobili() {
		if(veicoli_inseriti > 0) {
			for(int i = 0; i < dim; i++) {
				if(vM[i] != null) {
					vM[i].visualizza();
					System.out.println("Posto veicolo nel parcheggio: " +  (i + 1));

				}
			}
		}else {
			System.out.println("Errore: il programma è VUOTO!");

		}
	}


	// ELIMINAZIONE:

	public void elimina_veicolo(int posto) {
		if(vM[posto - 1] != null) {
			vM[posto - 1] = null;
			veicoli_inseriti --;

		}else {
			System.out.println("Errore: il posto è libero!");

		}
	}


	// INFORMAZIONI GARAGAE:
	
	// (Stessa cosa del visualizza...)

}
