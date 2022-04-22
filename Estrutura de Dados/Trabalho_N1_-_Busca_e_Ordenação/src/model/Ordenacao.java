/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Arrays;

/**
 *
 * @author WsmGyn
 */
public class Ordenacao {
    
// --------------------------------------------------------------------------------------------------------------
	public void selectionSort(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int indice = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].length() < arr[indice].length()) {
					indice = j;
				}
			}
			String menorNumero = arr[indice];
			arr[indice] = arr[i];
			arr[i] = menorNumero;				
		}
	}

// --------------------------------------------------------------------------------------------------------------
	public void insertionSort(String array[]) {
		for (int j = 1; j < array.length; j++) {
			String key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i].length() > (key.length()))) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

// --------------------------------------------------------------------------------------------------------------
	public void MergeSort(String[] arr, int len) {
		if (len < 2) {
			return;
		}

		int mid = len / 2;
		String[] left_arr = new String[mid];
		String[] right_arr = new String[len - mid];

		// Dividindo array em dois e copiando em dois arrays separados
		int k = 0;
		for (int i = 0; i < len; ++i) {
			if (i < mid) {
				left_arr[i] = arr[i];
			} else {
				right_arr[k] = arr[i];
				k = k + 1;
			}
		}
		// Chamando recursivamente a funï¿½ï¿½o para dividir ainda mais os subarrays
		MergeSort(left_arr, mid);
		MergeSort(right_arr, len - mid);

		// Chamando o mï¿½todo de mesclagem em cada subdivisï¿½o
		Merge(left_arr, right_arr, arr, mid, len - mid);
	}

	public void Merge(String[] left_arr, String[] right_arr, String[] arr, int left_size, int right_size) {

		int i = 0, l = 0, r = 0;

		// Os loops while verificam as condiï¿½ï¿½es de mesclagem
		while (l < left_size && r < right_size) {

			if (left_arr[l].length() < right_arr[r].length()) {
				arr[i++] = left_arr[l++];
			} else {
				arr[i++] = right_arr[r++];
			}
		}
		while (l < left_size) {
			arr[i++] = left_arr[l++];
		}
		while (r < right_size) {
			arr[i++] = right_arr[r++];
		}
	}
// --------------------------------------------------------------------------------------------------------------

	public  String[] QuickSort(String[] arr, int elements) {
		if (elements < 2) { // Base Case
			return arr;
		}

		int current_position = 0; // posiï¿½ï¿½o do elemento pivï¿½
		String temp; // uma variï¿½vel temporï¿½ria para ajudar na troca

		for (int i = 1; i < elements; i++) // Loop de particionamento
		{
			if (arr[i].length() <= arr[0].length()) {
				current_position++;
				temp = arr[i];
				arr[i] = arr[current_position];
				arr[current_position] = temp;
			}
		}

		temp = arr[0];
		arr[0] = arr[current_position];
		arr[current_position] = temp; // Traz o pivï¿½ para sua posiï¿½ï¿½o apropriada

		String[] left = QuickSort(arr, current_position); // ordena os elementos ï¿½ esquerda do pivï¿½

		String[] arr2 = Arrays.copyOfRange(arr, current_position + 1, elements);// separa os elementos ï¿½ direita do pivï¿½

		String[] right = QuickSort(arr2, elements - current_position - 1); // ordena os elementos ï¿½ direita do pivï¿½

		String[] final_array = new String[elements]; // array final, para mesclar tudo junto

		for (int i = 0; i < current_position; i++) {
			final_array[i] = left[i];
		}
		final_array[current_position] = arr[current_position];
		for (int i = current_position + 1; i < elements; i++) {
			final_array[i] = right[i - current_position - 1];
		}

		return final_array;

	}


// --------------------------------------------------------------------------------------------------------------

	// Busca Sequencial

	public String BuscaSeq(String A[], String x) {
		String saida = "Nao encontrado";
		int i;
		for (i = 0; i < A.length; i++) {
			if (x.equals(A[i]))
				return saida = A[i]+" Posicao: "+(i+1);
		}
		return saida;
	}

// --------------------------------------------------------------------------------------------------------------

// Busca Binaria
	// NECESSARIO VETOR ESTAR ORDENADO

	public String BuscaBinTamanho(String A[], String x, int inicio, int fim) {
		String saida = "Nao encontrado";
		int meio;
		if (inicio > fim)
			return saida ;
		meio = (inicio + fim) / 2;
		//System.out.println(inicio + " " +meio +" " +fim+" 6");
		if (x.equals(A[meio])) {
                    saida = A[meio]+" Posicao: "+(meio+1);
			return saida;
		}
		else {
			if(x.length() == A[meio].length()) {
				int indiceFrente = meio;
				while (x.length() == A[indiceFrente].length()) {
					if(A[indiceFrente].equals(x)) {
						 saida = A[meio]+" Posicao: "+(meio+1);
						return saida;
					}
					else {
						indiceFrente++;
					}
				}
				indiceFrente = meio;
				while (x.length() == A[indiceFrente].length()) {
					if(A[indiceFrente].equals(x)) {
						 saida = A[meio]+" Posicao: "+(meio+1);
						return saida;
					}
					else {
						indiceFrente--;
					}
				}
				return saida;
			}
			else {
				if (x.length() < A[meio].length()) {
					
					return (BuscaBinTamanho(A, x, inicio, meio -1));	
				}
					
				else {
					return (BuscaBinTamanho(A, x, meio+1, fim));
				}	
			}
		}
	}

// --------------------------------------------------------------------------------------------------------------

}
