package boletin_16;

import persoal.Persoal;

/**
 *
 * @author andrea
 */
public class Academica {

    private static int numReferencia = 2017;//  variable  de clase correlativa ( a primeira referencia ten valor  2018 )
    private String nome;
    private float nota;//  ( o valor debe estar entre 1 e 10 )   
    private Persoal alum;

    public Academica() {
    }

    public Academica(int numReferencia, String nome, float nota, Persoal alum) {
        this.numReferencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
        numReferencia++;
    }

    public double getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "numReferencia=" + numReferencia + ", nome=" + nome + "\nnota: " + CalculaNotas.getNotaFinal() + ", alum=" + alum + '}';
    }

}
