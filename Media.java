import java.util.Scanner;
 class Medial{ 
	public static void main(String args[]){
		
		Scanner tcl = new Scanner(System.in);
		System.out.println("Digite a nota da 1° prova: ");
		double p1 = tcl.nextInt();
		System.out.println("Digite a nota da 2° prova: ");
		double p2 = tcl.nextInt();
		System.out.println("Digite a nota da 3° prova: ");
		double p3 = tcl.nextInt();
		System.out.println("Digite a nota da 4° prova: ");
		double p4 = tcl.nextInt();
		double media = (p1 + p2 + p3 + p4)/4;
		System.out.println("media = " + media);
	}
}
