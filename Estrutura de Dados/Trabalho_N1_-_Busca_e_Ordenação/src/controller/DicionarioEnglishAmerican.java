/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author WsmGyn
 */
public class DicionarioEnglishAmerican {
     private String dicionarioOriginalEnglishAmerican[] = new String[48447];

    public String[] getDicionarioOriginalEnglishAmerican() {
        return dicionarioOriginalEnglishAmerican;
    }

    public void setDicionarioOriginalEnglishAmerican(String[] dicionarioOriginalEnglishAmerican) {
        this.dicionarioOriginalEnglishAmerican = dicionarioOriginalEnglishAmerican;
    }

    public String[] LerEnglishAmerican() {
        int i = 0;
        try {

            FileReader fr = new FileReader("./src/dicionario/EnglishAmerican.dic.48447.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = ";";
            while ((linha = br.readLine()) != null) {
                for (String str : linha.split(";")) {
                    dicionarioOriginalEnglishAmerican[i++] = str.trim();
                }
            }
            br.close();
            return dicionarioOriginalEnglishAmerican;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO LEITURA");
        }
        return dicionarioOriginalEnglishAmerican;
    }

    public void GravarEnglishAmericanOrdenado() {
        try {
            // Criar o arquivo
            FileWriter fw = new FileWriter("./src/dicionario/Ordenado/EnglishAmerican.dic.Ordenado.txt");

            // criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < dicionarioOriginalEnglishAmerican.length; i++) {

                bw.write(dicionarioOriginalEnglishAmerican[i].trim() + "\n");
            }
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO GRAVACAO");
        }
    }

    public String[] LerEnglishAmericanOrdenado() {
        int i = 0;
        try {

            FileReader fr = new FileReader("./src/dicionario/Ordenado/EnglishAmerican.dic.Ordenado.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = ";";
            while ((linha = br.readLine()) != null) {
                for (String str : linha.split(";")) {
                    dicionarioOriginalEnglishAmerican[i++] = str.trim();
                }
            }
            br.close();
            return dicionarioOriginalEnglishAmerican;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO LEITURA");
        }
        return dicionarioOriginalEnglishAmerican;
    }

    
}
