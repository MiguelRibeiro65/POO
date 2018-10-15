import java.util.Scanner;
import java.math.BigInteger;

public class Exercicio6{

	public static void fact(int n){
		BigInteger f = new BigInteger("1");

		for(int i = 2 ; i <= n ; i++){
			f = f.multiply(BigInteger.valueOf(i));
		}

		//System.out.println("O fatorial é: " + f);

	}

	public static void main(String[] args){

		int p = Integer.parseInt(args[0]);
		fact(p);


	}
}