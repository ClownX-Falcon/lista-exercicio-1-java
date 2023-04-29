import java.util.Scanner;

public class Exq9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============== Exercicio 9 ===============");
        System.out.println("Conversor de segundos para horas e minutos");
        System.out.println("===========================================");
        System.out.print("Digite a quantidade de segundos: ");
        int segundos = scanner.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60; 
        System.out.println(segundos + " segundo(s) são " + horas + " hora(s) " + minutos + " minuto(s) e " + segundos + " segundo(s)");
        scanner.close();
    }

}