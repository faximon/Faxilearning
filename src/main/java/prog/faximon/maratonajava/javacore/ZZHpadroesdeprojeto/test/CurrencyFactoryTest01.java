package prog.faximon.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import prog.faximon.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import prog.faximon.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import prog.faximon.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}