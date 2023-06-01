package averagecalculation;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,muzik;
		Scanner inp= new Scanner(System.in);
		System.out.println("Matematik Notu Giriniz:");
		mat=inp.nextInt();
		System.out.println("Kimya Notu Giriniz:");
		kimya=inp.nextInt();
		System.out.println("Turkce Notu Giriniz:");
		turkce=inp.nextInt();
		System.out.println("Tarih Notu Giriniz:");
		tarih=inp.nextInt();
		System.out.println("Muzik Notu Giriniz:");
		muzik=inp.nextInt();
		System.out.println("Fizik Notu Giriniz:");
		fizik=inp.nextInt();
		double sonuc=(mat+fizik+kimya+turkce+tarih+muzik)/6;
		String str=(sonuc>=60) ? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
		System.out.println(str);
		 
	}

}
