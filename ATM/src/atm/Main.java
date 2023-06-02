package atm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName,passWord;
		Scanner input=new Scanner(System.in);
		int right=3;
		double balance=1500;
		int select;
		
		
		while(right>0) {
			System.out.print("Kullanıcı Adınız:");
			userName=input.nextLine();
			System.out.print("Şifrenizi giriniz:");
			passWord=input.nextLine();
			if(userName.equals("patika")&& passWord.equals("123")) {
				System.out.println("Merhaba,Bankamıza Hoşgeldiniz!");
				System.out.println("Lütfen işleminizi seçiniz: \n"+
				"1-Para yatırma\n"+
				"2-Para Çekme\n"+
				"3-Bakiye Sorgulama\n"+
				"4-Çıkş yap!");
				select=input.nextInt();
				switch(select) {
				case 1:
					System.out.println("Para Miktarı:");
					int price=input.nextInt();
					balance+=price;
					break;
				case 2:
					System.out.println("Para Miktarı:");
				    price=input.nextInt();
					if(price>balance) {
						System.out.println("Bakiye yetersiz");
					}else {
						balance-=price;
					}
					break;
				case 3:
					
					System.out.println("Bakiyeniz:"+balance);
					break;
					
				case 4:
					
					System.out.println("Sistemden çıkış yapıyorsunuz!");
					break;
					
				default:
					System.out.println("Yanlış seçim yaptınız!");
					
				}
			}else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre giridiniz!");
				if(right==0) {
					
				System.out.println("Hesabınız bloke olmuştur liütfen bankanızla iletişime geçiniz!");
				
				}else {
					
				System.out.println("Kalan hakkınız:"+right);
				
				}
			}
		}
		input.close();

	}

}
