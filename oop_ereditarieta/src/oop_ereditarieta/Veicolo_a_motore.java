package oop_ereditarieta;

import java.util.Scanner;

public class Veicolo_a_motore {

	// ATTRIBUTI:
	
	private int anno_imm;
	private String marca;
	private String tipo_alim;
	private int cilindrata;
	
	
	// COSTRUTTORE DEFAULT:
	
	public Veicolo_a_motore() {
		this.anno_imm = 0;
		this.marca = "";
		this.tipo_alim = "";
		this.cilindrata = 0;
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	public Veicolo_a_motore(int anno_imm, String marca, String tipo_alim, int cilindrata) {
		this.anno_imm = anno_imm;
		this.marca = marca;
		this.tipo_alim = tipo_alim;
		this.cilindrata = cilindrata;
		
	}
	
	
	// SET & GET:
	
	// ANNO_IMM:
	
	public void setAnno_imm(int anno_imm) {
		if(anno_imm > 1900) {
			this.anno_imm = anno_imm;
			
		}else {
			this.anno_imm = 0;
			
		}
	}
	
	public int getAnno_imm() {
		return anno_imm;
		
	}
	
	
	// MARCA:
	
	public void setMarca(String marca) {
		if(marca.length() > 0) {
			this.marca = marca;
			
		}else {
			this.marca = "";
			
		}
	}
	
	public String getMarca() {
		return marca;
		
	}
	
	
	// TIPO_ALIM:
	
	public void setTipo_alim(String tipo_alim) {
		if(tipo_alim.length() > 0) {
			this.tipo_alim = tipo_alim;
			
		}else {
			this.tipo_alim = "";
			
		}
	}
	
	public String getTipo_alim() {
		return tipo_alim;
		
	}
	
	
	// CILINDRATA:
	
	public void setCilindrata(int cilindrata) {
		if(cilindrata > 0) {
			this.cilindrata = cilindrata;
			
		}else {
			this.cilindrata = 0;
			
		}
	}
	
	public int getCilindrata() {
		return cilindrata;
		
	}
	
	
	// INSERIMENTO:
	
	public void inserimento() {
		Scanner keyboard = new Scanner(System.in);
		
		int anno_imm;
		String marca;
		String tipo_alim;
		int cilindrata;
		
		
		// ANNO_IMM:
		
		do {
			System.out.print("Anno immatricolazione: ");
			anno_imm = keyboard.nextInt();
			keyboard.nextLine();
			
		}while((anno_imm < 1900) || (anno_imm > 2023));
		setAnno_imm(anno_imm);
		
		
		// MARCA:
		
		do {
			System.out.print("Marca: ");
			marca = keyboard.nextLine();
			
		}while(marca.length() <= 0);
		setMarca(marca);
		
		
		// TIPO_ALIM:
		
		do {
			System.out.print("Tipo alimentazione: ");
			tipo_alim = keyboard.nextLine();
			
		}while(tipo_alim.length() <= 0);
		setTipo_alim(tipo_alim);
		
		
		// CILINDRATA:
		
		do {
			System.out.print("Cilindrata: ");
			cilindrata = keyboard.nextInt();
			keyboard.nextLine();
			
		}while(cilindrata <= 0);
		setCilindrata(cilindrata);
		
	}
	
	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println("Anno immatricolazione: " + anno_imm);
		System.out.println("Marca: " + marca);
		System.out.println("Tipo alimentazione: " + tipo_alim);
		System.out.println("Cilindrata: " + cilindrata);
		
	}
}
