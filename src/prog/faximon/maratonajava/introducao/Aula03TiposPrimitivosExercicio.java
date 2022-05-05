package prog.faximon.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "José";
        String endereco = "Rua de testes numero 30";
        double salario = 2000.50;
        byte dataDia = 30;
        byte dataMes = 03;
        int dataAno = 2022;

        System.out.println("Eu "+nome+", morando no endereço "+endereco+"," +
                "confirmo que recebi o salário de R$"+salario+", na data "+dataDia+"/"+dataMes+"/"+dataAno);
    }
}
