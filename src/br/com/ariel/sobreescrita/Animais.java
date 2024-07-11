package br.com.ariel.sobreescrita;

public class Animais {
    private String nome;
    private double peso;

    public Animais(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void emitirSom() {
        System.out.println("som do animals");
        System.out.println("teste");
    }
}
