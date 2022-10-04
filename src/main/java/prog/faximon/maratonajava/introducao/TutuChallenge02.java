package prog.faximon.maratonajava.introducao;

public class TutuChallenge02 {
    public static void main(String[] args) {
        String palavraA = "pato";
        String palavraB = "topa";
        boolean quantidadeLetras = false;
        int letraIgualA = 0;
        int letraIgualB = 0;

        if (palavraA.length() == palavraB.length()) {
            quantidadeLetras = true;
        }

        for (int i = 0; i <= palavraA.length() && quantidadeLetras; i++) {
            for (int j = 0; j <= palavraA.length(); j++) {
                if (palavraA.charAt(i) == palavraB.charAt(j)) {
                    letraIgualA++;
                }
                if (palavraB.charAt(i) == palavraA.charAt(j)) {
                    letraIgualB++;
                }
                j++;
            }
            i++;
        }
        String resultado = letraIgualA == letraIgualB ? "É um anagrama" : "Não é um anagrama";
        System.out.println(resultado);
    }
}