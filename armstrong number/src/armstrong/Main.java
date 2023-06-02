package armstrong;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int number,numberValue,sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir sayı giriniz:");
	number=scan.nextInt();
	while(number!=0) {
		numberValue=number%10;
		sum=sum+numberValue;
		number/=10;
	}
	System.out.println(sum);
}
}
