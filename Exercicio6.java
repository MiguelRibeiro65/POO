import java.util.Scanner;

public class Exercicio6{

	public static void fact(int n){
		int f = n;
		
		while(n != 1){

			if(n == 1) break;
			f = f*(n-1);
			n--;
		}

		System.out.println("O fatorial é: " + f);


	}

	public static void main(String[] args){

		int p = Integer.parseInt(args[0]);
		fact(p);


	}
}