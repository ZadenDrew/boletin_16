package boletin_16;

import persoal.Persoal;

/**
 *
 * @author andrea
 */
public class Boletin_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notas;
        CalculaNotas.calcularNotas();
        notas = CalculaNotas.getNotaFinal();
        Persoal persoa = new Persoal(671967801, "acabezas@danielcastelao.org");
        Academica acad = new Academica(2018, "Andrea", notas, persoa);
        //  CalculaNotas.calcularNotas();
        System.out.println(acad.toString());

    }

}
