/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author dener
 */
public class DicionarioPortugueseBrazilian {
  
	private String DicionarioPortugueseBrazilian[] = new String[307374];

	public String[] getDicionarioPortugueseBrazilian() {
		return DicionarioPortugueseBrazilian;
	}

	public void setDicionarioPortugueseBrazilian(String[] DicionarioPortugueseBrazilian) {
		this.DicionarioPortugueseBrazilian = DicionarioPortugueseBrazilian;
	}

	public String[] LerPortugueseBrazilian() {
		int i = 0;
		try {

			FileReader fr = new FileReader("./src/dicionario/PortugueseBrazilian.dic.307374.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = ";";
			while ((linha = br.readLine()) != null) {
				for (String str : linha.split(";")) {
					DicionarioPortugueseBrazilian[i++] = str;
				}
			}
			br.close();
			return DicionarioPortugueseBrazilian;
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ERRO LEITURA");
		}
		return DicionarioPortugueseBrazilian;
	}

	public void GravarPortugueseBrazilianOrdenado() {
		try {
			// Criar o arquivo
			FileWriter fw = new FileWriter("./src/dicionario/Ordenado/PortugueseBrazilian.dic.Ordenado.txt");

			// criar o buffer do arquivo
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < DicionarioPortugueseBrazilian.length; i++) {

				bw.write(DicionarioPortugueseBrazilian[i] + "\n");
			}
			bw.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO GRAVACAO");
		}
	}

	public String[] LerPortugueseBrazilianOrdenado() {
		int i = 0;
		try {

			FileReader fr = new FileReader("./src/dicionario/Ordenado/PortugueseBrazilian.dic.Ordenado.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = ";";
			while ((linha = br.readLine()) != null) {
				for (String str : linha.split(";")) {
					DicionarioPortugueseBrazilian[i++] = str;
				}
			}
			br.close();
			return DicionarioPortugueseBrazilian;
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ERRO LEITURA");
		}
		return DicionarioPortugueseBrazilian;
	}
}
