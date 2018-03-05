package boletin_16;

import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class CalculaNotas {

    private static float notaPrimero, notaSegundo, notaParcial, notaFinal;

    public static void calcularNotas() {

        JOptionPane.showMessageDialog(null, "Pruebas escritas (teoría).");
        notaPrimero = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota del primer examen."));

        while (notaPrimero > 10 || notaPrimero < 0) {
            notaPrimero = Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta.\nIntroduzca la nota del primer examen."));
        }

        notaSegundo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota del segundo examen."));

        while (notaSegundo > 10 || notaSegundo < 0) {
            notaSegundo = Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta.\nIntroduzca la nota del segundo examen."));
        }

        notaParcial = (notaPrimero + notaSegundo) / 2;

        notaFinal = notaParcial;
    }

    public static float getNotaFinal() {
        return notaFinal;
    }

}
