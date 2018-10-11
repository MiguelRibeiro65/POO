import java.util.Scanner;
import java.lang.Math;

public class Exercicio4{

	public static void main(String[] args){

		int n;
		double num;
		Scanner s = new Scanner(System.in);

		System.out.println("Quantos números quer inserir?");
			
		n = s.nextInt();
			
		for(int i = 0 ; i<n ; i++){
			Scanner s1 = new Scanner(System.in);

			System.out.println("Insira o numero " + (i+1));
			num = s1.nextDouble();

			System.out.println("Raiz: " + Math.sqrt(num));

		}

	}
}