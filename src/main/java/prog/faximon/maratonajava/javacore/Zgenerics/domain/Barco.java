package prog.faximon.maratonajava.javacore.Zgenerics.domain;

public class Barco {
    private String nome;


    public Barco(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}