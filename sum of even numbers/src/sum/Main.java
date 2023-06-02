package sum;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int n, total=0;
	Scanner scan=new Scanner(System.in);
	
	do{
		System.out.print("Sayı giriniz:");
		n=scan.nextInt();
		
		if((n%2==0)&&(n%4==0)) {
			total+=n;		
		}	
	}while(!(n%2==1));

	System.out.print("Toplam:"+total);
	}

}
