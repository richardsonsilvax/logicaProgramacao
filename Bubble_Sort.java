import java.util.Scanner;
 class Maior_menor_igual{ 
	public static void main(String args[]){
Scanner tcl = new Scanner(System.in);
		int vetor[] = new int [10];
		System.out.println("Digite os valores do vetor: ");
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = tcl.nextInt();
		}
		for(int i = 0; i < vetor.length; i++){
			for(int j = 0; j < vetor.length; j++){
				if(vetor[i] > vetor[j]){
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]+"\t");
		}
	}
}
