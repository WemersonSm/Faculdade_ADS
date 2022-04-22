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
public class DicionarioSpanish {
    
  private String dicionarioOriginalSpanish[] = new String[70157];

    public String[] getDicionarioOriginalSpanish() {
        return dicionarioOriginalSpanish;
    }

    public void setDicionarioOriginalSpanish(String[] dicionarioOriginalSpanish) {
        this.dicionarioOriginalSpanish = dicionarioOriginalSpanish;
    }

    public String[] LerSpanish() {
        int i = 0;
        try {

            FileReader fr = new FileReader("./src/dicionario/Spanish.dic.70157.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = ";";
            while ((linha = br.readLine()) != null) {
                for (String str : linha.split(";")) {
                    dicionarioOriginalSpanish[i++] = str;
                }
            }
            br.close();
            return dicionarioOriginalSpanish;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO LEITURA");
        }
        
        return dicionarioOriginalSpanish;
    }

    public void GravarSpanishOrdenado() {
        try {
            // Criar o arquivo
            FileWriter fw = new FileWriter("./src/dicionario/Ordenado/Spanish.dic.Ordenado.txt");

            // criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < dicionarioOriginalSpanish.length; i++) {
            	//if(!dicionarioOriginalSpanish[i].equals(""))
                bw.write(dicionarioOriginalSpanish[i] + "\n");
            }
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO GRAVACAO");
        }
    }
    
    

    public String[] LerSpanishOrdenado() {
        int i = 0;
        try {

            FileReader fr = new FileReader("./src/dicionario/Ordenado/Spanish.dic.Ordenado.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = ";";
            while ((linha = br.readLine()) != null) {
                for (String str : linha.split(";")) {
                    dicionarioOriginalSpanish[i++] = str.trim();
                }
            }
            br.close();
            return dicionarioOriginalSpanish;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO LEITURA");
        }
        return dicionarioOriginalSpanish;
    }

    
}
