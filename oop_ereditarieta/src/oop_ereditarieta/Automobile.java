package oop_ereditarieta;

import java.util.Scanner;

public class Automobile extends Veicolo_a_motore{

	// ATTRIBUTI:
	
	private String targa;
	private String modello;
	private int n_porte;
	
	
	// COSTRUTTORE DEFAULT:
	
	public Automobile() {
		super();
		this.targa = "";
		this.modello = "";
		this.n_porte = 0;
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	public Automobile(int anno_imm, String marca, String tipo_alim, int cilindrata, String targa, String modello, int n_porte) {
		super(anno_imm, marca, tipo_alim, cilindrata);
		this.targa = targa;
		this.modello = modello;
		this.n_porte = n_porte;
		
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
	
	
	// N_PORTE:
	
	public void setN_porte(int n_porte) {
		if(n_porte > 0) {
			this.n_porte = n_porte;
			
		}else {
			this.n_porte = 0;
			
		}
	}
	
	public int getN_porte() {
		return n_porte;
		
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
		
		
		// N_PORTE:
		
		do {
			System.out.print("Numero porte: ");
			n_porte = keyboard.nextInt();
			keyboard.nextLine();
			
		}while(n_porte < 0);
		setN_porte(n_porte);
		
	}
	
	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println(" - AUTOMOBILE - ");
		super.visualizza();
		System.out.println("Targa: " + targa);
		System.out.println("Modello: " + modello);
		System.out.println("Numero porte: " + n_porte);
		System.out.println();
		
	}
}
