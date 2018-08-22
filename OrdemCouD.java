
import java.util.Scanner;

public class OrdemCouD {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int aux = 0;
        System.out.print("Quantos valores: ");
        int n = scr.nextInt();
        System.out.println("Ordem Crescente ou Decrescente: [c/d]");
        String CouD = scr.next();
        int v[] = new int[n];
        if(CouD != "c" || CouD != "d"){
            System.out.println("valor nao encntrado");
            System.out.println("Ordem Crescente ou Decrescente: [c/d]");
            CouD = scr.next(); 
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("kdkkd");
            v[i] = scr.nextInt();
        }
        if (CouD.equals("c") || CouD.equals("C")) {
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length; j++) {
                    if (v[i] < v[j]) {
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
                }
            }
        } else if (CouD.equals("d") || CouD.equals("D")) {
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length; j++) {
                    if (v[i] > v[j]) {
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
