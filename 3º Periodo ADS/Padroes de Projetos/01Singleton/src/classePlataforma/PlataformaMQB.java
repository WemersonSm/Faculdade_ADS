/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classePlataforma;

/**
 *
 * @author WsmGyn
 */
public class PlataformaMQB {

    private String identificador = "CARROS DA PLATAFORMA MQB";
    private int quantidadeDeCarros = 0;

    private static PlataformaMQB PlataformaMQBUnica = null;

    private PlataformaMQB() {
    }

    public static PlataformaMQB getInstanciaPlataformaMQB() {
        if (PlataformaMQBUnica == null) {
            PlataformaMQBUnica = new PlataformaMQB();
        }
        return PlataformaMQBUnica;
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
