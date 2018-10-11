
import java.util.Scanner;

public class Exercicio2{

	public static void dizMaior(int i1, int i2){

		if(i1 > i2){
			System.out.println("O maior é o " + i1);
		}
		else{
			System.out.println("O maior é o " + i2);
		}
	}

	public static void main(String[] args){

		int n1, n2;
		double m;

		Scanner s = new Scanner(System.in);

		System.out.println("Insira o numero 1: ");
		n1 = s.nextInt();
		System.out.println("Insira o numero 2: ");
		n2 = s.nextInt();

		m = (n1+n2)/2;

		dizMaior(n1,n2);
		System.out.println("Média: " + m);
	}

	

}