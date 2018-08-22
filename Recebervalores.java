
import java.util.Scanner;

public class Recebervalores {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        if (a > b) {
            System.out.println(a + " é o maior");
        } else if (a < b) {
            System.out.println(b + " é o maior");
        } else {
            System.out.println("São iguais");
        }
    }
}
