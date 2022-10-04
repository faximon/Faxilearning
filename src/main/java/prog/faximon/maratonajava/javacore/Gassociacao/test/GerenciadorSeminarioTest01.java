package prog.faximon.maratonajava.javacore.Gassociacao.test;

import prog.faximon.maratonajava.javacore.Gassociacao.dominio.Aluno;
import prog.faximon.maratonajava.javacore.Gassociacao.dominio.Local;
import prog.faximon.maratonajava.javacore.Gassociacao.dominio.Professor;
import prog.faximon.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciadorSeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}

//public class GerenciadorSeminarioTest01 {
//    public static void main(String[] args) {
//        Aluno aluno1 = new Aluno("Joao", 25);
//        Aluno aluno2 = new Aluno("Maria", 22);
//        Aluno aluno3= new Aluno("Pedrinho", 26);
//        Aluno aluno4= new Aluno("José", 23);
//        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4};
//
//        Professor professor1 = new Professor("Marcos", "Fisica");
//        Professor professor2 = new Professor("Priscila", "Geologia");
//        Professor[] professores = {professor1, professor2};
//
//        Local local1 = new Local("Sala 02");
//        Local local2 = new Local("Sala 12");
//
//        Seminario seminario1 = new Seminario("Fisica Quântica", alunos, professores, local1);
//        Seminario seminario2 = new Seminario("Geologia para dummies", alunos, professores, local2);
//
//        Seminario[] seminarios = {seminario1, seminario2};
//
//        aluno1.setSeminario(seminario1);
//        aluno2.setSeminario(seminario2);
//        aluno3.setSeminario(seminario1);
//        aluno4.setSeminario(seminario2);
//
//        professor1.setSeminarios(seminarios);
//        professor2.setSeminarios(seminarios);
//
//    }
//}
