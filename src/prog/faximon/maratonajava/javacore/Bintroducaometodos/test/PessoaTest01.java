package prog.faximon.maratonajava.javacore.Bintroducaometodos.test;

import prog.faximon.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "jiraya";
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
