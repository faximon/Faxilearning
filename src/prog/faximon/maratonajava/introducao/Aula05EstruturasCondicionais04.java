package prog.faximon.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 10000;
        double valorTaxas;


        if (salario >= 0 && salario <= 34712) {
            valorTaxas = (salario * 9.70) / 100;
        } else if (salario >= 34713 && salario <= 68507) {
            valorTaxas = (salario * 37.35) / 100;
        } else
            valorTaxas = (salario * 49.50) / 100;

        System.out.println("O valor que pago em taxas é de: $" +valorTaxas);
    }
}
