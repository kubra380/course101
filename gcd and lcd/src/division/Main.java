package division;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int n1 = inp.nextInt();
	        System.out.print("Enter second number: ");
	        int n2 = inp.nextInt();
	        int a= n1,b=n2,gcd=1,lcd,k=2;

	        while ((a %k == 0) && (b%k==0))
	        {
	            a= a/k;
	            b= b/k;
	            gcd*=k;
	            if ((a % k != 0 ) || (b % k != 0))
	            {
	                k++;
	            }

	        }
	        lcd = (n1*n2)/gcd;
	        System.out.println("Ebob: "+ gcd);
	        System.out.print("Ekok: "+ lcd);

	}

}
