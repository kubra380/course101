package factorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, total=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Sayı giriniz:");
		n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			total=total*i;
		}

	
	System.out.println(n + ".Sayının Faktöriyeli: "+total);
	}
}
