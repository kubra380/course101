package power;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		n=scan.nextInt();
		
		for(int i=1;i<=n;i*=4) {
			
			System.out.println(n+ " ten küçük olan 4 ün kuvvetleri:"+i);
		}
		for(int i=1;i<=n;i*=5) {
			
			System.out.println(n+ " ten küçük olan 5 in kuvvetleri:"+i);
		}
	}

}
