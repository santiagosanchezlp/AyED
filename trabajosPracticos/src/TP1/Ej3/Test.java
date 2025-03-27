package TP1.Ej3;

public class Test {
	public static Estudiante[] crearArregloEstudiante (Estudiante est1, Estudiante est2) {
		Estudiante[] arreglo = new Estudiante[2];
		arreglo[0] = est1;
		arreglo[1] = est2;
		return arreglo;
	}
	public static Profesor[] crearArregloProfesor (Profesor prof1, Profesor prof2, Profesor prof3) {
		Profesor[] arreglo = new Profesor[3];
		arreglo[0] = prof1;
		arreglo[1] = prof2;
		arreglo[2] = prof3;
		return arreglo;
	}
	
	public static void imprimirDatosArreglo (Profesor[] arreglo) {
		for (int i = 0; i < arreglo.length;i++) {
			System.out.print(arreglo[i].tusDatos()+"\n");
		}
	}
	
	public static void imprimirDatosArreglo (Estudiante[] arreglo) {
		for (int i = 0; i < arreglo.length;i++) {
			System.out.print(arreglo[i].tusDatos()+"\n");
		}
	}
	
	public static void main(String[] args) {

		Estudiante est1 = new Estudiante("Juan", "Perez", 1, "juanperez@gmail.com", "2 Nº166");
		Estudiante est2 = new Estudiante("Juana", "Guzman", 2, "juanaguzman@gmail.com", "3 Nº333");
		Profesor prof1 = new Profesor ("Enrique", "Gomez", "enriquegomez@gmail.com", "AyED", "Facultad Informatica");
		Profesor prof2 = new Profesor ("Pedro", "Bielsa", "pedrobielsa@gmail.com", "OO2", "Facultad Informatica");
		Profesor prof3 = new Profesor ("Pablo", "Basile", "pablobasile@gmail.com", "Matematica A", "Facultad Economicas");
		Estudiante [] arregloEstudiante = crearArregloEstudiante ( est1,  est2);
		Profesor [] arregloProfesor = crearArregloProfesor ( prof1,  prof2,  prof3);
		imprimirDatosArreglo(arregloEstudiante);
		imprimirDatosArreglo(arregloProfesor);
	}
}
