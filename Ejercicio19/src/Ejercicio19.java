import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, numEntrada, suma, numImpar;
		suma = 0;
		
		System.out.println("Vamos a calcular el cuadrado de un número sumando números impares");
		numEntrada = entrada.nextInt();
		num = 0;
		int contador = 1;
		while (contador<=numEntrada) {
			numImpar = numeroImpar(num);
			suma = suma + numImpar;
			System.out.print(numImpar+ "  ");
			num++;
			contador ++;
		}
		System.out.println("");
		System.out.println("El cuadrado de "+numEntrada+" es: "+suma);
	}
	public static int numeroImpar(int num) {
		int impar = 2*num+1;
		return impar;
			
	}
}


		

