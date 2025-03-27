package TP1;

import java.util.Random;

public class Ej5Parametros {
	public static void rellenarArreglo (int[] arreglo) {
		Random rand = new Random();
		for (int i =0;i<arreglo.length;i++) {
			arreglo[i] =  rand.nextInt(1000);;
		}
	}
	
	public static int[] calcularEstadisticasReturn (int[] arreglo) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int avg = 0;
		for (int i=0;i<arreglo.length;i++) {
			if (arreglo[i]<min)
				min = arreglo[i];
			if (arreglo[i]>max)
				max = arreglo [i];
			avg+=arreglo[i];
		}
		avg=avg/arreglo.length;
		int[] dev = new int[3];
		dev[0] = min;
		dev[1]= max;
		dev[2]= avg;
		return dev;
	}
	
	public static void calcularEstadisticasParametro (int[] arreglo, Integer max, Integer min, Integer avg) {
		for (int i=0;i<arreglo.length;i++) {
			if (arreglo[i]<min)
				min = arreglo[i];
			if (arreglo[i]>max)
				max = arreglo [i];
			avg+=arreglo[i];
		}
		avg=avg/arreglo.length;

	}
	
	public static void Main (String[] args) {

		int[] arreglo = new int[20];
		rellenarArreglo(arreglo);
		Integer max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, avg = 0;
		int[] estad = new int[3];
		estad = calcularEstadisticasReturn(arreglo);
		System.out.print(estad[0]+estad[1]+estad[2]);
		calcularEstadisticasParametro(arreglo, max, min, avg);
		System.out.print(max+min+avg);
	}
}
