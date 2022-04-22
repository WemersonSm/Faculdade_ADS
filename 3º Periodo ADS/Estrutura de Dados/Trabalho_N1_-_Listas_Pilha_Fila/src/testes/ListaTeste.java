package testes;

import br.com.listas.EmptyListException;
import br.com.listas.Lista;

public class ListaTeste {
	public static void main(String[] args) {

		Lista list = new Lista();
		// insere inteiros na lista
		list.insereNoInicio(1);
		System.out.println(list.print());
		list.insereNoFim(2);
		System.out.println(list.print());
		list.insereNoFim(3);
		System.out.println(list.print());

		list.insereNoFim(4);
		System.out.println(list.print());

		list.insereNoFim(5);
		System.out.println(list.print());

//		try {
//			list.insertAtPosicao(1, "A");
//			System.out.println(list.print());
//		} catch (EmptyListException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// String saida =list.print();

		System.out.println(list.buscaElemento(5));

		try {

			// Object removedObject = list.removeFromPosicao(2);
			// System.out.printf("%s removido\n", "Posição: " + removedObject);
			// System.out.println(list.print());

			// removedObject = list.removeNoFim();
			// System.out.printf("%s removido\n", removedObject);
			// System.out.println(list.print());

			Object removedObject = list.removeFromValor(7);
			System.out.printf("%s removido\n", "Posição: " + removedObject);
			System.out.println(list.print());

		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		
//		// remove objetos da lista; imprime depois de cada remoção
//		try {
//			Object removedObject = list.removeNoInicio();
//			System.out.printf("%s removido\n", removedObject);
//			list.print();
//			removedObject = list.removeNoInicio();
//			System.out.printf("%s removido\n", removedObject);
//			list.print();
//			removedObject = list.removeNoFim();
//			System.out.printf("%s removido\n", removedObject);
//			list.print();
//			removedObject = list.removeNoFim();
//			System.out.printf("%s removido\n", removedObject);
//			list.print();
//			removedObject = list.removeNoFim();
//			System.out.printf("%s removido\n", removedObject);
//			list.print();
//		}// fim do try
//		catch (EmptyListException e) {
//			e.printStackTrace();
//		}// fim do catch
//		

	}// fim de main
}// fim da classe ListTest