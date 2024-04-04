import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja verificar: ");
        int numero = scanner.nextInt();

        boolean pertence = verificarFibonacci(numero);

        if (pertence) {
            System.out.println("O número " + numero + " perterce a sequencia Fibonacci");
        } else {
            System.out.println("O número " + numero + " não perterce a sequencia Fibonacci");
        }
        scanner.close();
    }
        public static boolean verificarFibonacci(int numero){
            int x = 0;
            int z = 1;
            while (z < numero){
                int temporaria = z;
                z = x + z;
                x = temporaria;
            }
            return z == numero;

        }
    }
