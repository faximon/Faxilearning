package prog.faximon.maratonajava.javacore.Bintroducaometodos.test;

import prog.faximon.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Kakashi";
        funcionario.idade = 30;
        funcionario.salarios = new double[] {1200, 800, 3000};

        funcionario.imprimeFuncionario();
        System.out.println("Média salarial: R$"+funcionario.mediaSalario());
    }
}
