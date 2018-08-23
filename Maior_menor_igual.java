import java.util.Scanner;
 class Maior_menor_igual{ 
	public static void main(String args[]){
		System.out.println("Digite um número:");
        int a = tcl.nextInt();
		System.out.println("Digite outro:");
        int b = tcl.nextInt();

        if(a > b){
            System.out.println(a +  " é o maior " + b);
        }else  if(a < b){
            System.out.println(b +  " é o maior que " + a);
        }
		else{
            System.out.println("São iguais");
        }
    }
}