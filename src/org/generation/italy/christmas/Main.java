package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> listaDesideri = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		String scelta;
		do {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			String desiderio = scan.next();
			listaDesideri.add(desiderio);
			System.out.println("La tua lista contiene " + listaDesideri.size() + " desideri");
			System.out.print("Continuare? (s/n) ");
			scelta = scan.next();
		} while (scelta.equals("s"));

		Collections.sort(listaDesideri);

		System.out.println("Ecco la tua lista:");
		Iterator<String> it = listaDesideri.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.print("Inserisci il tuo nome:");
		String nome = scan.nextLine();
		System.out.print("\nInserisci il tuo indirizzo: ");
		String indirizzo = scan.nextLine();
		
		LetteraBabboNatale lettera = new LetteraBabboNatale(nome, indirizzo, listaDesideri);
		
		try {
			System.out.println(lettera.invia(nome, indirizzo, listaDesideri));
		} catch (IllegalArgumentException e) {
			System.out.println("Impossibile creare la lettera a Babbo Natale:");
			System.out.println(e.getMessage());
		}
		
		scan.close();

	}

}
