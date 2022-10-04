package prog.faximon.maratonajava.javacore.Npolimorfismo.servico;

import prog.faximon.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
