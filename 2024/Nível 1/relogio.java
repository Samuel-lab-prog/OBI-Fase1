import java.util.Scanner;

public class relogio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();
        int minutos = scanner.nextInt();
        int segundos = scanner.nextInt();
        int segundosAdiados = scanner.nextInt();

        int totalSegundos = horas * 3600 + minutos * 60 + segundos + segundosAdiados;

        if(totalSegundos >= 86400){
            int qtdDias = totalSegundos / 86400;
            totalSegundos = totalSegundos - qtdDias * 86400;
        }

        horas = totalSegundos / 3600;
        int restoHoras = totalSegundos % 3600;

        minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;

        segundos = restoMinutos;
        
        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(segundos);

        scanner.close();

        
    }
}
