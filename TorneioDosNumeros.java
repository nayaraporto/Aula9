package Aula9;
import java.util.Scanner;
public class TorneioDosNumeros {

	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		int neutro = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for ( int i = 1; i < 10; i++) {
		System.out.print("Digite um número: ");
		int num = ler.nextInt();
		
		if (num == 0) {
			neutro++;
			
		} else if (num % 2 == 0) {
			par++;
		} else {
			impar++;
			
		}
		}
		
		System.out.print(" Par: " + par + ", impar: " + impar);
		
		if (par>impar) {
		System.out.println(" Número par venceu: ");
		
		} 
		else if ( par == impar) {
			System.out.println("Empate");
		}
		else {
			System.out.print(" Número impar venceu: ");
		}
		 System.out.println("O número 0 foi digitado " + neutro + "x");
		
		ler.close();
		
	}

}
