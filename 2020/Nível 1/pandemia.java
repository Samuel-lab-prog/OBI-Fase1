import java.util.*;

public class pandemia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdEncontros = scanner.nextInt();
        int primeiroInfectado = scanner.nextInt();
        int primeiroEncontroInfectado = scanner.nextInt();

        HashSet<Integer> infectados = new HashSet<>();
        infectados.add(primeiroInfectado);
        for (int i = 0; i < qtdEncontros; i++) {
            int qtdPresentes = scanner.nextInt();
            HashSet<Integer> participantes = new HashSet<>();
            for (int j = 0; j < qtdPresentes; j++) {
                int amigo = scanner.nextInt();
                participantes.add(amigo);
            }
            if (i < primeiroEncontroInfectado - 1) {
                continue;
            } else {
                for (int amigo2 : participantes) {
                    if (infectados.contains(amigo2)) {
                        infectados.addAll(participantes);
                        break;
                    }
                }
            }
        }
        System.out.println(infectados.size());
        scanner.close();
    }
}
