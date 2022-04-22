package testes;

import br.com.listas.EmptyListException;
import br.com.listas.Fila;

public class FilaTeste {
	public static void main(String[] args) {
		Fila queue = new Fila();
		// utiliza o método enqueue
		queue.enfileira(1);
		queue.print();
		queue.enfileira(2);
		queue.print();
		queue.enfileira(3);
		queue.print();
		queue.enfileira(4);
		queue.print();
		queue.enfileira(5);
		queue.print();
		

		
		Object removedObject;
		try {
			removedObject = queue.desenfileira();
			System.out.printf("%s saiu da Fila, próximo poderá ser atendido\n",	removedObject);
			queue.print();
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// utiliza método dequeue

		
		
		
//		// remove os objetos da fila
//		try {
//			Object removedObject = null;
//			while (true) {
//				removedObject = queue.desenfileira();// utiliza método dequeue
//				System.out.printf("%s saiu da Fila, próximo poderá ser atendido\n",	removedObject);
//				queue.print();
//			}// fim do while
//		}// fim de try
//		catch (EmptyListException e) {
//			e.printStackTrace();// imprime a pilha de erros
//		}// fim do catch
	}// fim de main
}// fim da classe QueueTest