import java.util.Scanner;
 class campeonato{ 
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int[] vet = new int[16];
		int a = 1; int b = 2; int c = 3; int d = 4; int e = 5; int f = 6; int g = 7; int h = 8; int i = 9; int j = 10; int k = 11; int l = 12; int m = 13; int n = 14; int o = 15; int p = 16;
		int aux = 0;
		while(aux <= 15){
		System.out.print((aux + 1) + "° posição da chave de jogos:");
		int jogador = entrada.nextInt();
		if(jogador > 16 || jogador < 1){
			while(jogador < 1 || jogador > 16){
			System.out.println("⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️");
			System.out.print("\nDigite um número válido:");
			jogador = entrada.nextInt();
			}
		}
		vet[aux] = jogador;
		aux++;
		}
		if(vet[0] == 1 && vet[1] == 9 || vet[1] == 1 && vet[0] == 9 || 
			vet[2] == 1 && vet[3] == 9|| vet[3] == 1 && vet[2] == 9 || 
			vet[4] == 1 && vet[5] == 9 || vet[5] == 1 && vet[4] == 9 || 
			vet[6] == 1 && vet[7] == 9 || vet[7] == 1 && vet[6] == 9 || 
			vet[8] == 1 && vet[9] == 9 || vet[9] == 1 && vet[8] == 9 ||
			vet[10] == 1 && vet[11] == 9 || vet[11] == 1 && vet[10] == 9 || 
			vet[12] == 1 && vet[13] == 9 || vet[13] == 1 && vet[12] == 9 || 
			vet[14] == 1 && vet[15] == 9 || vet[15] == 1 && vet[14] == 9) {
			System.out.println("oitavas");
		 }else if(vet[0] == 1 && vet[2] == 9 || vet[0] == 9 && vet[2] == 1 ||
			vet[0] == 1 && vet[3] == 9 || vet[0] == 9 && vet[3] == 1 ||
			vet[1] == 1 && vet[2] == 9 || vet[1] == 9 && vet[2] == 1 ||
			vet[1] == 1 && vet[3] == 9 || vet[1] == 9 && vet[3] == 1 ||
			vet[4] == 1 && vet[6] == 9 || vet[4] == 9 && vet[6] == 1 ||
		 vet[4] == 1 && vet[7] == 9 || vet[4] == 9 && vet[7] == 1 ||
		 vet[5] == 1 && vet[6] == 9 || vet[5] == 9 && vet[6] == 1 ||
		 vet[5] == 1 && vet[7] == 9 || vet[5] == 9 && vet[7] == 1 ||
			vet[8] == 1 && vet[10] == 9 || vet[8] == 9 && vet[10] == 1 ||
			vet[8] == 1 && vet[11] == 9 || vet[8] == 9 && vet[11] == 1 ||
		 vet[9] == 1 && vet[10] == 9 || vet[9] == 9 && vet[10] == 1 ||
		 vet[9] == 1 && vet[11] == 9 || vet[9] == 9 && vet[11] == 1 ||
			vet[12] == 1 && vet[14] == 9 || vet[12] == 9 && vet[14] == 1 ||
		 vet[12] == 1 && vet[15] == 9 || vet[12] == 9 && vet[15] == 1 ||
		 vet[13] == 1 && vet[14] == 9 || vet[13] == 9 && vet[14] == 1 ||
		 vet[13] == 1 && vet[15] == 9 || vet[13] == 9 && vet[15] == 1){
				 System.out.println("quartas");
		 }else if(vet[0] == 1 && vet[4] == 9 || vet[0] == 9 && vet[4] == 1 ||
			 vet[0] == 1 && vet[5] == 9 || vet[0] == 9 && vet[5] == 1 ||
			 vet[0] == 1 && vet[6] == 9 || vet[0] == 9 && vet[6] == 1 ||
			 vet[0] == 1 && vet[7] == 9 || vet[0] == 9 && vet[7] == 1 ||
			 vet[1] == 1 && vet[4] == 9 || vet[1] == 9 && vet[4] == 1 ||
			 vet[1] == 1 && vet[5] == 9 || vet[1] == 9 && vet[5] == 1 ||
			 vet[1] == 1 && vet[6] == 9 || vet[1] == 9 && vet[6] == 1 ||
			 vet[1] == 1 && vet[7] == 9 || vet[1] == 9 && vet[7] == 1 ||
			 vet[2] == 1 && vet[4] == 9 || vet[2] == 9 && vet[4] == 1 ||
			 vet[2] == 1 && vet[5] == 9 || vet[2] == 9 && vet[5] == 1 ||
			 vet[2] == 1 && vet[6] == 9 || vet[2] == 9 && vet[6] == 1 ||
			 vet[2] == 1 && vet[7] == 9 || vet[2] == 9 && vet[7] == 1 ||
			 vet[3] == 1 && vet[4] == 9 || vet[3] == 9 && vet[4] == 1 ||
			 vet[3] == 1 && vet[5] == 9 || vet[3] == 9 && vet[5] == 1 ||
			 vet[3] == 1 && vet[6] == 9 || vet[3] == 9 && vet[6] == 1 ||
			 vet[3] == 1 && vet[7] == 9 || vet[3] == 9 && vet[7] == 1 ||
			 vet[8] == 1 && vet[12] == 9 || vet[8] == 9 && vet[12] == 1 ||
			 vet[8] == 1 && vet[13] == 9 || vet[8] == 9 && vet[13] == 1 ||
			 vet[8] == 1 && vet[14] == 9 || vet[8] == 9 && vet[14] == 1 ||
			 vet[8] == 1 && vet[15] == 9 || vet[8] == 9 && vet[15] == 1 ||
			 vet[9] == 1 && vet[12] == 9 || vet[9] == 9 && vet[12] == 1 ||
			 vet[9] == 1 && vet[13] == 9 || vet[9] == 9 && vet[13] == 1 ||
			 vet[9] == 1 && vet[14] == 9 || vet[9] == 9 && vet[14] == 1 ||
			 vet[9] == 1 && vet[15] == 9 || vet[9] == 9 && vet[15] == 1 ||
			 vet[10] == 1 && vet[12] == 9 || vet[10] == 9 && vet[12] == 1 ||
			 vet[10] == 1 && vet[13] == 9 || vet[10] == 9 && vet[13] == 1 ||
			 vet[10] == 1 && vet[14] == 9 || vet[10] == 9 && vet[14] == 1 ||
			 vet[10] == 1 && vet[15] == 9 || vet[10] == 9 && vet[15] == 1 ||
			 vet[11] == 1 && vet[12] == 9 || vet[11] == 9 && vet[12] == 1 ||
			 vet[11] == 1 && vet[13] == 9 || vet[11] == 9 && vet[13] == 1 ||
			 vet[11] == 1 && vet[14] == 9 || vet[11] == 9 && vet[14] == 1 ||
			 vet[11] == 1 && vet[15] == 9 || vet[11] == 9 && vet[15] == 1){
				 System.out.println("semifinal");
		 }else if(vet[0] == 1 && vet[8] == 9 || vet[0] == 9 && vet[8] == 1 ||
		 	vet[0] == 1 && vet[9] == 9 || vet[0] == 9 && vet[9] == 1 ||
			vet[0] == 1 && vet[10] == 9 || vet[0] == 9 && vet[10] == 1 ||
			vet[0] == 1 && vet[11] == 9 || vet[0] == 9 && vet[11] == 1 ||
			vet[0] == 1 && vet[12] == 9 || vet[0] == 9 && vet[12] == 1 ||
			vet[0] == 1 && vet[13] == 9 || vet[0] == 9 && vet[13] == 1 ||
			vet[0] == 1 && vet[14] == 9 || vet[0] == 9 && vet[14] == 1 ||
			vet[0] == 1 && vet[15] == 9 || vet[0] == 9 && vet[15] == 1 ||
			vet[1] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[1] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[1] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[1] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[1] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[1] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[1] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[1] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1 ||
			vet[2] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[2] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[2] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[2] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[2] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[2] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[2] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[2] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1 ||
			vet[3] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[3] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[3] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[3] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[3] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[3] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[3] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[3] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1 ||
			vet[4] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[4] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[4] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[4] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[4] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[4] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[4] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[4] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1 ||
			vet[5] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[5] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[5] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[5] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[5] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[5] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[5] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[5] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1 ||
			vet[6] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[6] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[6] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[6] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[6] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[6] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[6] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[6] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1 ||
			vet[7] == 1 && vet[8] == 9 || vet[1] == 9 && vet[8] == 1 ||
		 	vet[7] == 1 && vet[9] == 9 || vet[1] == 9 && vet[9] == 1 ||
			vet[7] == 1 && vet[10] == 9 || vet[1] == 9 && vet[10] == 1 ||
			vet[7] == 1 && vet[11] == 9 || vet[1] == 9 && vet[11] == 1 ||
			vet[7] == 1 && vet[12] == 9 || vet[1] == 9 && vet[12] == 1 ||
			vet[7] == 1 && vet[13] == 9 || vet[1] == 9 && vet[13] == 1 ||
			vet[7] == 1 && vet[14] == 9 || vet[1] == 9 && vet[14] == 1 ||
			vet[7] == 1 && vet[15] == 9 || vet[1] == 9 && vet[15] == 1){
			 System.out.println("final");
		 }
		
		}
}
