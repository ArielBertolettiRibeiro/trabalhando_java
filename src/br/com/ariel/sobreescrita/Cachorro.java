package br.com.ariel.sobreescrita;

public class Cachorro extends Animais{
    private String raca;
    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
