package oop_ereditarieta;

import java.util.Scanner;

public class Motocicletta extends Veicolo_a_motore {

	// ATTRIBUTI:
	
	private String targa;
	private String modello;
	
	
	// COSTRUTTORE DEFAULT:
	
	public Motocicletta() {
		super();
		this.targa = "";
		this.modello = "";
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	public Motocicletta(int anno_imm, String marca, String tipo_alim, int cilindrata, String targa, String modello) {
		super(anno_imm, marca, tipo_alim, cilindrata);
		this.targa = targa;
		this.modello = modello;
		
	}
	
	
	// SET & GET:
	
	// TARGA:
	
	public void setTarga(String targa) {
		if(targa.length() > 0) {
			this.targa = targa;
			
		}else {
			this.targa = "";
			
		}
	}
	
	public String getTarga() {
		return targa;
		
	}
	
	
	// MODELLO:
	
	public void setModello(String modello) {
		if(modello.length() > 0) {
			this.modello = modello;
			
		}else {
			this.modello = "";
			
		}
	}
	
	public String getModello() {
		return modello;
		
	}
	
	
	// INSERIMENTO:
	
	public void inserimento() {
		Scanner keyboard = new Scanner(System.in);
		
		String targa;
		String modello;
		int n_porte;
		
		
		super.inserimento();
		
		
		// TARGA:
		
		do {
			System.out.print("Targa: ");
			targa = keyboard.nextLine();
			
		}while(targa.length() <= 0);
		setTarga(targa);
		
		
		// MODELLO:
		
		do {
			System.out.print("Modello: ");
			modello = keyboard.nextLine();
			
		}while(modello.length() <= 0);
		setModello(modello);
		
	}
	
	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println(" - MOTOCICLETTA - ");
		super.visualizza();
		System.out.println("Targa: " + targa);
		System.out.println("Modello: " + modello);
		System.out.println();
		
	}
	
}
