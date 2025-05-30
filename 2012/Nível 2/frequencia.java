import java.util.HashSet;
import java.util.Scanner;

public class frequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet <Integer> alunos = new HashSet<>();
        int total = scanner.nextInt();

        for(int i = 0; i < total; i++)
            alunos.add(scanner.nextInt());

        System.out.println(alunos.size());
        scanner.close();
    }
}
