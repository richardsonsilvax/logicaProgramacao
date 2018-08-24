import java.util.Scanner;
 class Busca_binaria { 
	public static void main(String args[]){
	Scanner tcl = new Scanner(System.in);
	int[] vetor = new int [5];
	//digitando os valores do vetor
	for(int i = 0; i < vetor.length; i++){
		System.out.println("Digite um valor para a posição "+i+" do vetor");
		vetor[i] = tcl.nextInt();
	}
	//ordenando o vetor
	for(int i = 0; i < vetor.length; i++){
		for(int j = 0; j < vetor.length; j++){
			if(vetor[i] < vetor[j]){
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
	}
	//imprimindo a ordem das posições do vetor
	for(int i = 0; i < vetor.length; i++){
		System.out.print(vetor[i]+" ");
	}
	//usuário diz que valor deseja encontrar no vetor
	System.out.println("\nDiga um número digitado para saber em que posição do vetor está:");
	int buscar = tcl.nextInt();
	int x = BuscaBinaria(vetor, 0,(vetor.length - 1),((vetor.length - 1)/ 2), buscar);
	//se o valor retornado for igual a -1
	if(x == -1){
		System.out.println("\n\nvalor não encontrado");
	}
	//se o valor retornado for não for -1
	else{
		System.out.println("\n\nNúmero encontrado na posição "+x);}
	}
	//Método para busca binária
	public static int BuscaBinaria(int v[], int inicio, int tam, int meio, int buscar){
		while(inicio <= tam){
			meio = (inicio + tam) / 2;
			if(buscar == v[meio]){
				return meio;
			}
			if(buscar < v[meio]){tam = meio - 1;}
			else{inicio = meio + 1;}
		}
		return -1;
	}
}
