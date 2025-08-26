import java.util.Scanner;

public class cifra {

    static String vogais = "aeiou";

    static boolean ehVogal(char c) {
        return vogais.indexOf(c) != -1;
    }

    static char vogalMaisProxima(char c) {
        char maisProxima = 'a';
        int menorDistancia = Integer.MAX_VALUE;

        for (char v : vogais.toCharArray()) {
            int dist = Math.abs(c - v);
            if (dist < menorDistancia || (dist == menorDistancia && v < maisProxima)) {
                menorDistancia = dist;
                maisProxima = v;
            }
        }
        return maisProxima;
    }

    static char proximaConsoante(char c) {
        for (char letra = (char) (c + 1); letra <= 'z'; letra++) {
            if (!ehVogal(letra)) {
                return letra;
            }
        }
        return 'z';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        StringBuilder cifra = new StringBuilder();

        for (char c : palavra.toCharArray()) {
            if (ehVogal(c)) {
                cifra.append(c);
            } else {
                cifra.append(c);
                cifra.append(vogalMaisProxima(c));
                cifra.append(proximaConsoante(c));
            }
        }

        System.out.println(cifra.toString());
        scanner.close();
    }
}
