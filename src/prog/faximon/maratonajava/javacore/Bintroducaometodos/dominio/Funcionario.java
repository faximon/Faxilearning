package prog.faximon.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimeFuncionario (){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);

        for (double salario : salarios) {
            System.out.println("Salário: R$"+salario);
        }
    }

    public double mediaSalario () {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= this.salarios.length;
        return media;
    }
}
