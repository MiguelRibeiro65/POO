

import java.util.Scanner;

public class Exercicio1{

	public static void main(String[] args){

		double saldo;
		String nome;

		Scanner s = new Scanner(System.in);

		System.out.println("Nome: ");
		nome = s.next();
		System.out.println("Saldo: ");
		saldo = s.nextDouble();
		

		System.out.println("Nome: "+ nome +"Saldo: " + saldo);
	}
}