
import java.util.Scanner;

public class intervalo {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite o n° de início: ");
        int inicio = scr.nextInt();
        System.out.print("Digite o n° do fim: ");
        int fim = scr.nextInt();
        if (inicio == fim + 1 || inicio == fim || fim == inicio + 1) {
            System.out.println("Não há intervalos");
        } else if (inicio < fim) {
            for (int i = inicio + 1; i < fim; i++) {
                System.out.println(i);

            }
        } else if (inicio > fim) {
            for (int i = fim + 1; i < inicio; i++) {
                System.out.println(i);

            }
        }
    }
}

