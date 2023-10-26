package oop_ereditarieta;

import java.util.Scanner;

public class Furgone extends Veicolo_a_motore{

	// ATTRIBUTI:
	
	private String targa;
	private String modello;
	private int cap_carico;
	
	
	// COSTRUTTORE DEFAULT:
	
	public Furgone() {
		super();
		this.targa = "";
		this.modello = "";
		this.cap_carico = 0;
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	public Furgone(int anno_imm, String marca, String tipo_alim, int cilindrata, String targa, String modello, int cap_carico) {
		super(anno_imm, marca, tipo_alim, cilindrata);
		this.targa = targa;
		this.modello = modello;
		this.cap_carico = cap_carico;
		
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
	
	
	// CAP_CARICO:
	
	public void setCap_carico(int cap_carico) {
		if(cap_carico > 0) {
			this.cap_carico = cap_carico;
			
		}else {
			this.cap_carico = 0;
			
		}
	}
	
	public int getCap_carico() {
		return cap_carico;
		
	}
	
	
	// INSERIMENTO:
	
	public void inserimento() {
		Scanner keyboard = new Scanner(System.in);
		
		String targa;
		String modello;
		int cap_carico;
		
		
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
		
		
		// CAP_CARICO:
		
		do {
			System.out.print("Capacità carico: ");
			cap_carico = keyboard.nextInt();
			keyboard.nextLine();
			
		}while(cap_carico < 0);
		setCap_carico(cap_carico);
		
	}
	
	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println(" - FURGONE - ");
		super.visualizza();
		System.out.println("Targa: " + targa);
		System.out.println("Modello: " + modello);
		System.out.println("Capacità carico: " + cap_carico);
		System.out.println();
		
	}
	
}
