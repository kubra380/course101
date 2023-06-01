package divisiblenumber;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int k, sum=0,count=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Sayı giriniz:");
		k=scanner.nextInt();
		for(int i=1; i<=k; i++) {
			if( (i %3 == 0) && (i %4 == 0) ) {
				
			sum+=i;
			count++;
			
			}
		}
		System.out.println("3 ve 4 bölünen sayıların ortalamsı:"+sum/count);
		
	}

}
