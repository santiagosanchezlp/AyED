package TP1;

import java.util.Scanner;

public class TP2CreadorArrays {
	public static int[] crearArray(int n) {
		int[] arreglo = new int [n];
		for (int i = 0; i <n;i++) {
			arreglo[i] =(n*(i+1));
		}
		return arreglo;
	}
	
	public static void imprimirArreglo(int[] arreglo){
		for (int i = 0; i < arreglo.length;i++) {
			System.out.print(arreglo[i]+"\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Ingrese un numero");
		int n = new Scanner(System.in).nextInt();
		int [] arreglo = crearArray(n);
		imprimirArreglo(arreglo);
	}
	
	
}
