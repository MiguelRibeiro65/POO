import java.util.Scanner;

public class Exercicio5{

	public static void main(String[] args){

		int nMax = 0, nMin = 0;
		int n = 1;
		int sum = 0;
		int f = 0;

		System.out.println("Insira os numeros!");

		while(n != 0){


			Scanner s = new Scanner(System.in);
			n = s.nextInt();
			if(n == 0) break;
			sum += n;

			nMax = Math.max(nMax, n);
			if(f == 0){
				nMin = n;
				f = 1;
			}

			nMin = Math.min(nMin,n);
		}

		System.out.println("A soma é " + sum + " . O maior número é " + nMax + " e o menor é " + nMin);
	}
}