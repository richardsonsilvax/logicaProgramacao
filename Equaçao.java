import java.util.Scanner;
public class Equaçao {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = scr.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = scr.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = scr.nextInt();
        
        int delta = (b * b) + (-4 * a * c); 
        int x1 = (-b + ((int)Math.sqrt(delta)))/2 * a;
        int x2 = (-b - ((int)Math.sqrt(delta)))/2 * a;
        if(delta > 0){
            System.out.println("X1: " + x1 + " X2: " + x2);
        }else if(delta < 0){
            System.out.println("Não existe raiz");
        }else{
            System.out.println("As raiz são iguais, valor: " + x1);
        }
        if(a > 0){
            System.out.println("Concavidade para cima.");
        }else{
            System.out.println("Concavidade para baixo.");
        }
    }
}