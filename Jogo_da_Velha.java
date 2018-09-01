// Jogo da velha
// Discente: Richardson Tavares Silva [1° informática]
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
		int jogador1 = 0,jogador2 = 0,lin = 0,col = 0, aux = 10, x = 1;
		String resposta = "xbxhhx";
		String matriz[][] = new String[3][3];
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length; j++){
				matriz[i][j] = "_";
			}
		}
		// Regras do jogo da velha
		System.out.println("\t\t### Regras do Jogo da Velha ###\n"
						   + "* O tabuleiro  é uma matriz  de três linhas por três colunas.\n\n"
						   + "* Dois jogadores escolhem uma marcação cada um, \n  geralmente um círculo (O) e um xis (X).\n\n"
						   + "* Os jogadores jogam alternadamente, uma marcação por vez, numa lacuna que esteja vazia.\n\n"
						   + "* O objetivo é conseguir três círculos ou três xis em linha, quer horizontal, vertical ou diagonal,\n  e ao mesmo tempo, quando possível, impedir o adversário de ganhar na próxima jogada.\n\n"
						   + "OBS: vazio = _\n\n\n"
						   + "\t\t ### JOGO DA VELHA ###");
		// Chamando o método Jogo_da_Velha
		aux = Jogo_da_Velha(matriz,jogador1,jogador2,lin,col,resposta,aux);
		// Se o jogador quiser uma revanche
		while(aux == 1){
			System.out.println("\n\n");
			System.out.println("\t### Vamos para a " + x +"° revanche ###");
			aux = Jogo_da_Velha(matriz,jogador1,jogador2,lin,col,resposta,aux);
			x++;
		}
	}
	// Método para jogar
	public static int Jogo_da_Velha(String matriz[][],int jogador1, int jogador2, int lin, int col,String resposta,int aux){
		Scanner tcl = new Scanner(System.in);
		for(int i = 0; i < 9; i++){
			// jogador1 joga
			if(i % 2 == 0){
				System.out.println("Jogador1[X] em que posição quer jogar?");
				jogador1 = tcl.nextInt();
				lin = jogador1;
				jogador1 = tcl.nextInt();
				col = jogador1;
				matriz[lin][col] = "X";
			}
			// jogador2 joga
			if(i % 2 != 0){
				System.out.println("Jogador2[O] em que posição quer jogar?");
				jogador2 = tcl.nextInt();
				lin = jogador2;
				jogador2 = tcl.nextInt();
				col = jogador2;
				matriz[lin][col] = "O";
			}
			System.out.println("");
			// mostrar o tabuleiro
			for(int a = 0; a < matriz.length; a++){
				for(int j = 0; j < matriz.length; j++){
					System.out.print(" [ " + matriz[a][j] + " ] ");
				}
				System.out.println("");
			}
			System.out.println("\n");
			// Se houver três O ou três X em uma linha horizontal,vertical ou diagonal
			if(i >= 4){
				if(matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2] && 
				   matriz[0][0] != "_" && matriz[0][1] != "_" && matriz[0][2] != "_" || 
				   matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2] && 
				   matriz[1][0] != "_" && matriz[1][1] != "_" && matriz[1][2] != "_" || 
				   matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2] && 
				   matriz[2][0] != "_" && matriz[2][1] != "_" && matriz[2][2] != "_" || 
				   matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0] && 
				   matriz[0][0] != "_" && matriz[1][0] != "_" && matriz[2][0] != "_" || 
				   matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1] && 
				   matriz[0][1] != "_" && matriz[1][1] != "_" && matriz[2][1] != "_" || 
				   matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2] &&
				   matriz[0][2] != "_" && matriz[1][2] != "_" && matriz[2][2] != "_" || 
				   matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] &&
				   matriz[0][0] != "_" && matriz[1][1] != "_" && matriz[2][2] != "_" ||
				   matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2] &&
				   matriz[2][0] != "_" && matriz[1][1] != "_" && matriz[0][2] != "_"){
					// Se o jogador 1 vencer
					if(i % 2 == 0){
						System.out.println("\nO vencedor é o ### jogador1 ###\n");
					}
					// Se o jogador 2 vencer
					else{
						System.out.println("\nO vencedor é o ### jogador2 ### \n");
					}
					break;
				}
			}
			// Se houver um empate
			if(i == 8){
				System.out.println("\t### Não houve vencedor ###");
				break;
			}
		}
		// Pegutar se quer uma revanche
		do{
			System.out.println("Quer jogar de novo?[S/N]");
			resposta = tcl.next();
			// se o jogador quiser uma revanche
			if(resposta.equals("S")){
				// Esvaziar a matriz
				for(int i = 0; i < matriz.length; i++){
					for(int j = 0; j < matriz.length; j++){
						matriz[i][j] = "#";
					}
				}
				aux = 1;
				break;
			}
			// Se o jogador não quizer uma revanche
			else if(resposta.equals("N")){
				System.out.println("\n\t### Gamer Over ###");
				aux = 0;
				break;
			}
		}
		// Enquanto o jogador não dizer S ou N
		while(resposta != "S" || resposta != "N");
		return aux;
    }
}