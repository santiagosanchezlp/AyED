package TP1.Ej1;
/*
1.	Escriba tres métodos de clase (static) que reciban por parámetro dos números enteros (tipo int) a y b e 
impriman todos los números enteros comprendidos entre a; b (inclusive), uno por cada línea en la salida estándar. 
Para ello, dentro de una nueva clase escriba un método por cada uno de los siguientes incisos:
a.	Que realice lo pedido con un for.
b.	Que realice lo pedido con un while.
c.	Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do while).
Por último, escriba en el método de clase main el llamado a cada uno de los métodos creados, con valores de ejemplo. 
En su computadora, ejecute el programa y verifique que se cumple con lo pedido.

 */
public class TP1NumerosConsecutivos {
	public static void escribirNrosIntermediosFor(int numero1, int numero2) {
			for (int i = numero1; i <= numero2; i++) {
				System.out.print(i+"\n");
			}
		}
	public static void escribirNrosIntermediosWhile(int numero1,int numero2) {
		int i = numero1;
        while (i <= numero2){
        	System.out.print(i+"\n");
            i++;
        } 
    }
	public static void escribirNrosIntermediosRecursion(int numero1,int numero2) {
		int i = numero1;
        if (i <= numero2){
            System.out.print(i+"\n");
            i++;
            escribirNrosIntermediosRecursion(i, numero2);
        }
	}
	public static void main(String[] args) {
		escribirNrosIntermediosFor(2,5);
		escribirNrosIntermediosWhile(2,5);
		escribirNrosIntermediosRecursion(2,5);
	}
}