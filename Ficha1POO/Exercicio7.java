import java.time.LocalDateTime;
import java.math.BigInteger;

public class Exercicio7 extends Exercicio6{

	public static void main(String[] args){

		LocalDateTime c1 = LocalDateTime.now();
		long millis1 = System.currentTimeMillis();
	
		System.out.println("Time: " + c1);

		fact(1000000);
		
		LocalDateTime c2 = LocalDateTime.now();
		long millis2 = System.currentTimeMillis();

		long res = millis2 - millis1;
		
		System.out.println("Time: " + c2);

		System.out.println("Demorou: " + res + " Milisegundos");
		
		
	}
}