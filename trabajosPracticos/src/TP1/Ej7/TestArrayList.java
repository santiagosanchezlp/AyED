package TP1.Ej7;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	
	public static void imprimirLista(List<Integer> lista) {
		for (int nro:lista)
			System.out.print(nro);
	}

	
	public static void main (String [] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(20);
		lista.add(10);
		lista.add(40);
		lista.add(50);
		lista.add(60);
		lista.add(70);
		lista.add(80);
		lista.add(90);
		lista.add(40);
		imprimirLista(lista);
	}
	
}
