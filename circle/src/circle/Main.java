package circle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi=3.14,area;
		int r,a;
		System.out.print("Dairenin yarıçapını giriniz:");
		Scanner scanner=new Scanner(System.in);
        r=scanner.nextInt();
        System.out.print("Dairenin açısını giriniz:");
        a=scanner.nextInt();
        
        area=(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı:"+area);
	}

}
