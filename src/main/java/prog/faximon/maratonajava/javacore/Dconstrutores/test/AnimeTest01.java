package prog.faximon.maratonajava.javacore.Dconstrutores.test;

import prog.faximon.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
//        Anime anime2 = new Anime();
        anime.imprime();
//        anime2.imprime();
    }
}