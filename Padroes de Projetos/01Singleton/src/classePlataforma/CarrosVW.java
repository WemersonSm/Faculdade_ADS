/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classePlataforma;

/**
 *
 * @author WsmGyn
 */
public class CarrosVW {

    private String nome = "";
    private PlataformaMQB PlataformaMQB = null;

    public CarrosVW(String nome, PlataformaMQB mqb) {
        this.nome = nome;
        PlataformaMQB = mqb;
        mqb.setQuantidadeDeCarros();
    }

    public String descricao() {
        String saida = "\n\nDados dos Carros Volkswagen\n";
        saida += "Nome: " + nome + "\n";
        saida += "Plataforma: " + PlataformaMQB.getIdentificador() + "\n";
        saida += "Quantidade de Carros Ultilizando Aqruitetura MQB: " + PlataformaMQB.getQuantidadeDeCarros() + "\n";
        saida += "Codigo: " + PlataformaMQB.hashCode();
        return saida;
    }
}
