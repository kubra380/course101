package powernumber;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, k, total=1;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Üssü alınacak sayı:");
		n=scan.nextInt();
		System .out.print("Sayının kuvveti");
		k=scan.nextInt();
		
		for(int i=1;i<=k;i++) {
			total=total*n;
			
		}
		System.out.println("Sayının " +k+ ". Kuvveti:"+total);
	}
	

}
