package ExerciciosCondicionais;
//Analisar o maior numero entre os tr�s e imprimi-lo

//03/03/2022
//Matheus

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n1, n2, n3;
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro numero");
		n3 = leia.nextInt();

		if (n1 > n2 && n1 > n3) {

			System.out.println("O primeiro numero: " + n1 + " � o maior entre os tr�s");

		} else if (n2 > n1 && n2 > n3) {

			System.out.println("O segundo numero: " + n2 + " � o maior entre os tr�s");
		} else if (n3 > n1 && n3 > n2) {

			System.out.println("O terceiro numero: " + n3 + " � o maior entre os tr�s");
		}

	leia.close();
	}

}
