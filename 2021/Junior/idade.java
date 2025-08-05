import java.util.*;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int [] idades = new int[3];
        for(int i = 0; i < 3; i++){
            idades[i] = scanner.nextInt();
        }
        Arrays.sort(idades);
        System.out.println(idades[1]);
        scanner.close();
    }
}