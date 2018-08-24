import java.util.Scanner;
 class consumo_km{ 
	public static void main(String args[]){
	    Scanner tcl = new Scanner( System.in);
        double km, litros;
        System.out.println("Digite a distância total em km");
        km = tcl.nextDouble();
        System.out.println("Digite o consumo total:");
        litros = tcl.nextDouble();
        double  consumo  = km / litros;
        System.out.println("O consumo é " +  consumo  + " litros por km " );
    }
}
