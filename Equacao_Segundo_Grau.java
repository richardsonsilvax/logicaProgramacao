import java.util.Scanner;
 class Equacao_Segundo_Grau{ 
	public static void main(String args[]){
		Scanner tcl = new Scanner( System.in);
        System.out.println("Digite o valor de a: ");
        int a = tcl.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = tcl.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = tcl.nextInt();

        int delta = (b * b) + ( - 4  * a * c);
        int x1 = (- b + (( int ) Math.sqrt(delta))) / 2  * a;
        int x2 = (- b - (( int ) Math.sqrt(delta))) / 2  * a;
        if (delta >  0 ) {
            System.out.println( "X1: "  + x1 +  " X2:" + x2);
        } else  if (delta <  0) {
            System.out.println( "Não existe raiz real!" );
        } 
		else{
            System.out.println( "Como raiz é igual, valor: "  + x1);
        }
        if (a >  0) {
            System.out.println( "Concavidade para cima" );
        } 
		else if(a == 0){
			System.out.println("concavidade não toca o eixo de x");
		}
		else{
            System.out.println( "Concavidade para baixo" );
        }
    }
}
