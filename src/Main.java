import br.com.ariel.construtores.Aluno;
import br.com.ariel.sobreescrita.Cachorro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Aluno aluno = new Aluno("Ariel", 19);
        Cachorro cachorro = new Cachorro("Salsicha", 34, "vira-lat");
        cachorro.emitirSom();
    }
}