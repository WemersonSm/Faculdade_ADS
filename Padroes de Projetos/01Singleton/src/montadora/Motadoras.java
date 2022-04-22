/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montadora;

import classePlataforma.*;

/**
 *
 * @author WsmGyn
 */
public class Motadoras {

    public static void main(String[] args) {
        CarrosVW tcross = new CarrosVW("T-CROSS 2022", PlataformaMQB.getInstanciaPlataformaMQB());
        System.out.println(tcross.descricao());

        CarrosVW golf = new CarrosVW("GOLF-R 2022", PlataformaMQB.getInstanciaPlataformaMQB());
        System.out.println(golf.descricao());

//        CarrosChevrolet onix = new CarrosChevrolet("ONIX 2022", PlataformaGEN.getInstanciaPlataformaGEN());
//        System.out.println(onix.descricao());
//
//        CarrosChevrolet tracker = new CarrosChevrolet("TRACKER 2022", PlataformaGEN.getInstanciaPlataformaGEN());
//        System.out.println(tracker.descricao());

    }

}
