import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase");
        String inverter = scanner.next();

        for (int i = inverter.length()-1; i >= 0; i--){
            char caractere = inverter.charAt(i);
            System.out.print(caractere + " ");
        }
    }
}
