import java.util.Scanner;

public class escher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int soma = A[0] + A[N - 1];
        boolean escher = true;
        if(N % 2 != 0){
            if(A[N / 2] * 2 != soma){
                escher = false;
            }
        }

       for(int i = 0; i < N / 2; i++){
        if(A[i] + A[N - 1 - i] != soma){
            escher = false;
            break;
        }
       }

        if (escher) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
