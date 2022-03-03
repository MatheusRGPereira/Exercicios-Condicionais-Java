package ExerciciosCondicionais;
//Imprima os numeros em ordem crescente
//03/03/2022
//Matheus

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double n1, n2, n3;

		System.out.println("Escreva o primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println("Escreva o segundo numero: ");
		n2 = leia.nextDouble();
		System.out.println("Escreva o terceiro numero: ");
		n3 = leia.nextDouble();

		if (n1 > n2 && n1 > n3 && n2 > n3) {

			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);

		} else if (n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		}

		else if (n2 > n1 && n2 > n3 && n1 > n3) {

			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
		} else if (n2 > n1 && n2 > n3 && n3 > n1) {

			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		}

		else if (n3 > n1 && n3 > n2 && n2 > n1) {

			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {

			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}

	leia.close();
	}

}
