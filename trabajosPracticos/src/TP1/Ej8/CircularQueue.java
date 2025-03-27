package TP1.Ej8;

public class CircularQueue<T> extends Queue<T> {
	public T shift() {
		T dato = this.dequeue();
		this.enqueue(dato);
		return dato;
	}
}
