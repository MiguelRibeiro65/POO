import java.util.Scanner;

public class Exercicio3{

	public static void main(String[] args){

		int c = 0;
		int k;
		int n;

		//Scanner s = new Scanner(System.in);

		for(k=0 ; k<10; k++){
			Scanner s = new Scanner(System.in);

			n = s.nextInt();
			
			if(n>5) c++;
		}

		System.out.println(c + " números são maiores que 5");
	}
}