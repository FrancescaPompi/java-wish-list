package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// creo l'array
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
		} while(scelta.equals("s"));
		
		Collections.sort(listaDesideri);
		
		System.out.println("Ecco la tua lista:");
		Iterator<String> it = listaDesideri.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
