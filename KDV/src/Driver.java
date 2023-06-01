import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
	double tutar,kdvorani,kdvlitutar,kdvtutari;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Fiyat girin:");
	tutar=scanner.nextDouble();
	
	kdvorani=(tutar>1000) ? 0.8:0.18;
	kdvtutari=tutar*kdvorani;
	kdvlitutar=tutar+kdvtutari;

	System.out.println("Ürün fiyati:"+tutar);
	System.out.println("KDV oranı:"+kdvorani);
	System.out.println("KDV fiyati:"+kdvtutari);
	System.out.println("KDV'li fiyat"+kdvlitutar);
	
	
	}

}
