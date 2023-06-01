package triangle;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		//ücgenin kenarları
		double a, b, c,u,cevre, alan;
		System.out.println("Üç kenar giriniz");
		Scanner scanner=new Scanner(System.in);
		System.out.print("Birinci kenar:");
		a=scanner.nextDouble();
		System.out.print("İkinci kenar:");
		b=scanner.nextDouble();
		System.out.print("Üçüncü kenar");
		c=scanner.nextDouble();
		
		//alan ve cevre hesaplama
		u=(a+b+c)/2;
		cevre=2*u;
		alan=u*(u-a)*(u-b)*(u-c);
		
		//çıktı
		System.out.println("Üçgenin Çevresi"+cevre);
		System.out.println("Üçgenin Alanı"+alan);
		
		
		
	}

}
