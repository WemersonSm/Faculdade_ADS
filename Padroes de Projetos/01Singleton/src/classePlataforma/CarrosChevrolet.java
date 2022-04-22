/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classePlataforma;

/**
 *
 * @author WsmGyn
 */
public class CarrosChevrolet {

    private String nome = "";
    private PlataformaGEN PlataformaGEN = null;

    public CarrosChevrolet(String nome, PlataformaGEN gen) {
        this.nome = nome;
        PlataformaGEN = gen;
        gen.setQuantidadeDeCarros();
    }

    public String descricao() {
        String saida = "\n\nDados dos Carros Chevrolet\n";
        saida += "Nome: " + nome + "\n";
        saida += "Plataforma: " + PlataformaGEN.getIdentificador() + "\n";
        saida += "Quantidade de Carros Ultilizando Aqruitetura GEN: " + PlataformaGEN.getQuantidadeDeCarros() + "\n";
        saida += "Codigo: " + PlataformaGEN.hashCode();
        return saida;
    }
}               
