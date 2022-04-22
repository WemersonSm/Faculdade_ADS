package br.com.listas;

public class Pilha extends Lista {
	public Pilha() {
		super("STACK - PILHA: ");
	}

	public void empilha(Object object) {
		insereNoFim(object);
	}

	public Object desempilha() throws EmptyListException {
		return removeNoFim();
	}
}