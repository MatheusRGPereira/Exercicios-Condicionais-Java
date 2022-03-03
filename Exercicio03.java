package ExerciciosCondicionais;

//Imprima as faixas etarias 
//03/03/2022
//Matheus
import java.util.*;

public class Exercicio03 {
	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int idade;
		
			System.out.println("Digite a sua idade");
			idade=leia.nextInt();
			
		if(idade >=10 && idade <=14)
		{
			System.out.println("Você esta na categoria Infantil");
		}
		else if(idade >=15 && idade <=17)
		{
			System.out.println("Você esta na categoria Juvenil");
		}
		else if(idade >=18 && idade <=25)
		{
			System.out.println("Você esta na categoria Adulto");
		}else
		{
			System.out.println("Você esta acima do limite de idade das nossas categorias");
		}
			
	leia.close();
	}

}
