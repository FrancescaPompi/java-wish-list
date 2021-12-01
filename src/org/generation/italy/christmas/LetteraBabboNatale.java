package org.generation.italy.christmas;

import java.util.List;

public class LetteraBabboNatale {
	
	private String nome;
	private String indirizzo;
	private List<String> listaDesideri;
	
	// costruttore
	public LetteraBabboNatale(String nome, String indirizzo, List<String> listaDesideri) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;
	}
	
	// metodo
	public String invia(String nome, String indirizzo, List<String> listaDesideri) {
		if(listaDesideri.size() > 5) {
			throw new IllegalArgumentException("puoi scegliere solo fino a 5 desideri.");
		} else {
			return "Info lettera: " + this.nome + "; " + this.indirizzo + "; " + this.listaDesideri;
		}
	}
	

}
