package model;

import java.util.Arrays;

public class Ordenacao_Thread implements Runnable {

    private String arr[];
    private String method;

    public Ordenacao_Thread(String[] arr, String method) {
        super();
        this.arr = arr;
        this.method = method;
    }

    public Ordenacao_Thread() {
        // TODO Auto-generated constructor stub
    }

    public void setArray(String[] arr) {
        this.arr = arr;
    }

    public String[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        if (this.method.equals("selectionsort")) {
            this.SelectionSort(arr);
        } else if (this.method.equals("insertionsort")) {
            this.InsertionSort(arr);
        }else if (this.method.equals("quicksort")) {
            setArray(this.QuickSort(arr, arr.length));
        }else if (this.method.equals("mergesort")) {
            this.MergeSort(arr, arr.length);          
        }

    }

// --------------------------------------------------------------------------------------------------------------
    public void SelectionSort(String[] arr) {
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
    public void InsertionSort(String array[]) {
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
    public String[] QuickSort(String[] arr, int elements) {
        if (elements < 2) { // Base Case
            return arr;
        }

        int current_position = 0; // posi��o do elemento piv�
        String temp; // uma vari�vel tempor�ria para ajudar na troca

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
        arr[current_position] = temp; // Traz o piv� para sua posi��o apropriada

        String[] left = QuickSort(arr, current_position); // ordena os elementos � esquerda do piv�

        String[] arr2 = Arrays.copyOfRange(arr, current_position + 1, elements);// separa os elementos � direita do piv�

        String[] right = QuickSort(arr2, elements - current_position - 1); // ordena os elementos � direita do piv�

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
}
