package br.com.listas;

public class Fila extends Lista {
	public Fila() {
		super("QUEUE - FILA: ");
	}

	public void enfileira(Object object) {
		insereNoFim(object);
	}

	public Object desenfileira() throws EmptyListException {
		return removeNoInicio();
	}
}