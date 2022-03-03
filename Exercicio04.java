package ExerciciosCondicionais;
//Imprima as faixas etarias 
//03/03/2022
//Matheus
import java.math.*;
import java.util.*;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int n1,calculo=0;
			System.out.println("Digite um numero");
			n1=leia.nextInt();
		
			
			if (n1%2 == 0)
			{
					System.out.println("O Numero " +n1+ " é par");
					System.out.println("e sua raiz quadrada é: "+Math.sqrt(n1));
			}else
			{		
				calculo=n1*n1;
				System.out.println("O numero " +n1+ " é impar");
				System.out.println("E o resultado da potencia é: "+calculo);
			}
	}

}
