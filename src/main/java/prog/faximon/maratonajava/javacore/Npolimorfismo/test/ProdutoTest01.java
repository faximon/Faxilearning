package prog.faximon.maratonajava.javacore.Npolimorfismo.test;

import prog.faximon.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import prog.faximon.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import prog.faximon.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import prog.faximon.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Toma Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
