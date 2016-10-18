import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Напишете програма, която попълва числата на Фибоначи в масив. Потребител въвежда колко да е голям масива.

		Scanner in=new Scanner(System.in);
		System.out.println("Imput number more than 1: ");
		int x = in.nextInt();
		
		int[] massive = new int[x];
		
massive[0]=1;
massive[1]=1;

for(int i=2;i<massive.length;i++){
	massive[i]=massive[i-1]+massive[i-2];
}
System.out.println(Arrays. toString(massive));
	}

}
