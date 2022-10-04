package prog.faximon.maratonajava.javacore.Npolimorfismo.test;

import prog.faximon.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import prog.faximon.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import prog.faximon.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import prog.faximon.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
