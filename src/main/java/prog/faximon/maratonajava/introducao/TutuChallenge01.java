package prog.faximon.maratonajava.introducao;

public class TutuChallenge01 {
    public static void main(String[] args) {
        String palavra = "anna";
        int palavraLength = palavra.length();
        int repeticao = (palavraLength - 1) /2;
        boolean palindromo = true;

             for (int i = 0; i <= repeticao && palindromo; i++) {
                 if (palavra.charAt(i) == palavra.charAt(palavraLength - 1)) {
                     palavraLength--;
                     palindromo = true;
                 } else {
                     palindromo = false;
                     break;
                 }
             }
        if (palindromo) {
            System.out.println(palavra + " é um palíndromo.");
        } else
            System.out.println("Não é palíndromo");

    }
}
