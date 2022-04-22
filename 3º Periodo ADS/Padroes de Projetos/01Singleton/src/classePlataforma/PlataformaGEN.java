/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classePlataforma;

/**
 *
 * @author WsmGyn
 */
public class PlataformaGEN {

    private String identificador = "CARROS DA PLATAFORMA GEN";
    private int quantidadeDeCarros = 0;

    private static PlataformaGEN PlataformaGENUnica = null;

    private PlataformaGEN() {
    }

    public static PlataformaGEN getInstanciaPlataformaGEN() {
        if (PlataformaGENUnica == null) {
            PlataformaGENUnica = new PlataformaGEN();
        }
        return PlataformaGENUnica;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getQuantidadeDeCarros() {
        return quantidadeDeCarros;
    }

    public void setQuantidadeDeCarros() {
        this.quantidadeDeCarros++;
    }

}
