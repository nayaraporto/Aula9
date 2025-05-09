package Aula9;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in); 
			System.out.println("Insira um número: ");
		int numero = ler.nextInt();
		
		System.out.println("Tabuada do número: " + numero + ":");
		for(int i = 1; i <= 10; i++) {
		System.out.println( numero + "x" + i + "=" + (numero*i));
			
	ler.close();
		}

	}

}
