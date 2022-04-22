package br.com.listas;

import javax.swing.JOptionPane;

public class Lista {
	private ListaNo primeiroNo;
	private ListaNo ultimoNo;
	private String nome;

	private int tamanhoLista;

	public Lista() {
		this("LISTA ENCADEADA: ");
		this.tamanhoLista = 0;
	}

	public Lista(String nomeDaLista) {
		nome = nomeDaLista;
		primeiroNo = ultimoNo = null;
		this.tamanhoLista = 0;
	}

	public void insereNoInicio(Object insertItem) {
		if (estaVazia()) {
			primeiroNo = ultimoNo = new ListaNo(insertItem);
		} else {
			if (buscaElemento(insertItem)) {
				JOptionPane.showInternalMessageDialog(null, "Elemento Já Existe");
				this.tamanhoLista--;
			} else {
				primeiroNo = new ListaNo(insertItem, primeiroNo);

			}
		}

		this.tamanhoLista++;
	}

	public void insereNoFim(Object insertItem) {
		if (estaVazia()) {
			primeiroNo = ultimoNo = new ListaNo(insertItem);
		} else {
			if (buscaElemento(insertItem)) {
				JOptionPane.showInternalMessageDialog(null, "Elemento Já Existe");
				this.tamanhoLista--;
			} else {
				ultimoNo = ultimoNo.proximoNo = new ListaNo(insertItem);
			}
		}
		this.tamanhoLista++;
	}

	public void insertAtPosicao(int posicao, Object elemento) throws EmptyListException {
		if (buscaElemento(elemento)) {
			throw new EmptyListException("Elemento já existe na lista");
		}
		if (posicao == 1) {
			insereNoInicio(elemento);
			return;
		} else if (posicao == tamanhoLista) {
			insereNoFim(elemento);
		} else {
			if (posicao <= this.tamanhoLista) {
				ListaNo current = primeiroNo;
				ListaNo anterior = null;
				ListaNo atual = null;
				for (int i = 1; i <= posicao; i++) {
					if (i == (posicao - 1)) {
						if (buscaElemento(elemento)) {
						} else {
							atual = current.getProximoNo();
							current.setProximoNo(anterior = new ListaNo(elemento));
							anterior.proximoNo = atual;
							this.tamanhoLista++;
						}
					}
					anterior = current;
					current = current.proximoNo;
				}
			}
			//return;
		}
		
		//throw new EmptyListException("Nao encontrado a Posição");
	}

	public Object removeNoInicio() throws EmptyListException {
		if (estaVazia()) {
			throw new EmptyListException(nome);
		}
		Object removedItem = primeiroNo.data;
		if (primeiroNo == ultimoNo) {
			primeiroNo = ultimoNo = null;
		} else {
			primeiroNo = primeiroNo.proximoNo;
		}
		this.tamanhoLista--;
		return removedItem;
	}

	public Object removeNoFim() throws EmptyListException {
		if (estaVazia()) {
			throw new EmptyListException(nome);
		}
		Object removedItem = ultimoNo.data;
		if (primeiroNo == ultimoNo) {
			primeiroNo = ultimoNo = null;
		} else {
			ListaNo current = primeiroNo;
			while (current.proximoNo != ultimoNo) {
				current = current.proximoNo;
			}
			ultimoNo = current;
			current.proximoNo = null;
		}
		this.tamanhoLista--;
		return removedItem;
	}

	public Object removeFromPosicao(int posicao) throws EmptyListException {
		Object removedItem = null;
		if (estaVazia()) {
			throw new EmptyListException(nome);
		}
		if (posicao == 0 || posicao > tamanhoLista) {
			throw new EmptyListException("Nao encontrado a Posição");
		} else if (posicao == 1) {
			removedItem = removeNoInicio();
		} else if (posicao == tamanhoLista) {
			removedItem = removeNoFim();
		} else {
			ListaNo current = primeiroNo;
			ListaNo atual = null;
			for (int i = 1; i <= posicao; i++) {
				if (i == (posicao - 1)) {
					atual = current.proximoNo;
					current.setProximoNo(atual.getProximoNo());
					removedItem = atual.data;
					this.tamanhoLista--;
				}
				current = current.proximoNo;
			}
		}

		return removedItem;
	}

	public Object removeFromValor(Object elemento) throws EmptyListException {
		if (estaVazia()) {
			throw new EmptyListException(nome);
		}
		if (buscaElemento(elemento) == false) {
			throw new EmptyListException("Elemento não encontrado na lista");
		}
		Object removedItem = null;
		ListaNo current = primeiroNo;
		ListaNo anterior = null;
		if (current.data == elemento) {
			return removedItem = removeNoInicio();
		}
		// ListaNo atual = null;
		for (int i = 1; i <= tamanhoLista; i++) {
			// if (i == 1) {
			// removedItem = removeNoInicio();
			// } else
			if (current.data == elemento) {
				removedItem = current.data;
				// anterior.proximoNo = anterior;
				anterior.proximoNo = current.proximoNo;
				// System.out.println(current.data + "data current2");
				// anterior = current.proximoNo;
				// System.out.println(anterior.data + "danta anterir");
				// atual = current.getProximoNo();
				/// System.out.println(anterior.data+"data atual");
				// current.setProximoNo(anterior);
				// System.out.println(current.data+"sd22");
				// atual = current.getProximoNo();
				// removedItem = current.getData();
				// anterior.proximoNo = atual;
				this.tamanhoLista--;
			}
			anterior = current;
			current = current.proximoNo;
		}
		if (removedItem == null) {
			removedItem = elemento + " Não Encontrado";
		}
		return removedItem;
	}

	public boolean buscaElemento(Object elemento) {
		if (estaVazia()) {
			return false;
		}

		ListaNo current = primeiroNo;
		for (int i = 1; i <= tamanhoLista; i++) {
			if (current.data == elemento || current.data.equals(elemento)) {
				// System.out.println("Elemento: " + elemento + " Encontrado" + " Posição: " +
				// i);
				return true;
			}
			current = current.proximoNo;
		}
		// System.out.println("Elemento: " + elemento + " Não Encontrado");
		return false;
	}

	public boolean estaVazia() {
		return primeiroNo == null;
	}

	public String print() {
		String saida = nome;
		if (estaVazia()) {
			saida = nome + " Vazia";

			return saida + " \n" + imprimeTamanho();
		}
		// System.out.printf("A lista %s é: ", nome);
		ListaNo current = primeiroNo;
		while (current != null) {
			saida += "-> " + current.data;
			current = current.proximoNo;
		}
		// System.out.printf("\n");
		// System.out.println(imprimeTamanho());
		return saida + " \n" + imprimeTamanho();
	}

	public String imprimeTamanho() {
		return "Tamanho da Lista: " + this.tamanhoLista;
	}
}
