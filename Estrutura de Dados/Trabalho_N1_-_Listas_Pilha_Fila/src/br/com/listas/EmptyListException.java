package br.com.listas;

public class EmptyListException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyListException() {

		this("List");
	}

	public EmptyListException(String name) {
		super("A: " + name + " - está vazia");
	}
}