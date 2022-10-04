package prog.faximon.maratonajava.javacore.Npolimorfismo.test;

import prog.faximon.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import prog.faximon.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
