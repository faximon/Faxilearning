package prog.faximon.maratonajava.javacore.Aintroducaoclasses.test;

import prog.faximon.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat Uno";
        carro1.modelo = "UNO ATTRACTIVE 1.0 FLEX";
        carro1.ano = 1999;

        carro2.nome = "Honda Civic";
        carro2.modelo = "2.0 LX CVT";
        carro2.ano = 2005;

        System.out.println("Carro 1 - Nome: "+carro1.nome+ ". Modelo: "+carro1.modelo+". Ano: "+carro1.ano+ ".");
        System.out.println("\nCarro 2 - Nome: "+carro2.nome+ ". Modelo: "+carro2.modelo+". Ano: "+carro2.ano+ ".");

    }
}
