package prog.faximon.maratonajava.javacore.Bintroducaometodos.test;

import prog.faximon.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
    }
}
