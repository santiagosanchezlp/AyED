package TP1.Ej9;

import java.util.*;

public class Balanceado {

	
	public static boolean estaBalanceado(String texto) {
		Stack <Character> pila = new Stack<Character>();
		for (int i=0; i <texto.length();i++) {
			Character c = texto.charAt(i);
			if (c == '{' || c == '[' || c == '(')
				pila.push(c);
			else if (pila.isEmpty())
				return false;
			else {
				char apertura = pila.pop();
				if (c == '}' && apertura != '{' 
						|| c == ']' && apertura != '[' 
						|| c == ')' && apertura != '(') 
					return false;
			}
		}
		return pila.isEmpty();
	}

	public static void main (String[] args) {
		String prueba1 = "{{{[[(()]]}";
		String prueba2 = "{[()]}";
		String prueba3 = "{[}]";
		
		System.out.print(estaBalanceado(prueba1));
		System.out.print(estaBalanceado(prueba2));
		System.out.print(estaBalanceado(prueba3));
	}
}