import java.util.Scanner;

public class caixas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

       if((B < C && A < B) || A + B < C){
           System.out.println(1);
       }
       else if(A == B && B == C){
           System.out.println(3);
       }
       else{
           System.out.println(2);
       }
}

