import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num, num1, num2, fibonacci;
		num1 = 1;
		num2 = 1;
		
		System.out.println("Esribe un número para realizar la secuencua de Fibonacci: ");
		num = entrada.nextInt();
		
		if(num==1) {
			System.out.println("1");
			
		}else {
			
			System.out.print(num1+"  "+num2+"  ");
			for (int i = 0; i < (num-2); i++) {
				fibonacci = num1 + num2;
				System.out.print(fibonacci+ "  ");
				num1= num2;
				num2=  fibonacci;			
				
			}
			
		}
		
	}
}


		

