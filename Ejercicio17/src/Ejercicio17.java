import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int notaMayor, notaMenor, nota;
		String nombreNotaMayor, nombreNotaMenor, nombre;
		notaMayor = 11;
		notaMenor = -1;
		nombreNotaMayor = " ";
		nombreNotaMenor = " ";
		
		
		for (int contador = 0; contador <= 40; contador++) {
			System.out.println("Inserta un nombre");
			nombre = entrada.next();
			
			System.out.println("Inserta una nota del 0 al 10");
			nota = entrada.nextInt();
			
			if (nota<0 || nota >10) {
				System.out.println("No has insertado un numero entre 0 y 10");
			}else {
				if (nota>notaMenor) {
					notaMenor = nota;
					nombreNotaMenor = nombre;

				}
				if (nota<notaMayor) {
					notaMayor = nota;
					nombreNotaMayor = nombre;
				}
				contador ++;
				
			}
		}
		System.out.println("La nota máxima obtenida es; "+notaMayor+" con el nombre: "+nombreNotaMayor);
		System.out.println("La nota mínima obtenida es; "+notaMenor+"con el nombre: "+nombreNotaMenor);
		
	}
}


		

