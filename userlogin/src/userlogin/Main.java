package userlogin;
import java.util.Scanner;
public class Main {

	

	public static void main(String[] args) {
		
	String userName,passWord,newPassWord,select;
	Scanner input=new Scanner(System.in);
	
	System.out.print("Kullanıcı Adınızı Giriniz:");
	userName=input.nextLine();
	
	System.out.print("Şifreizi Giriniz:");
	passWord=input.nextLine();
	
	if(userName.equals("kubra") && passWord.equals("123")) {
		System.out.println("Giriş yaptınız!");

	}else  {
		
	System.out.println("Bilgileriniz yanlış");
	System.out.println("Şifrenizi yenilemk ister misiniz? (evet/ hayır)");
	select=input.nextLine();
	
	
	switch(select) {
	case "evet":
		
		System.out.println("Yeni şifreyi giriniz:");
		newPassWord=input.nextLine();
		
		if(newPassWord.equals("123")){
			System.out.println("Yeni şifreniz eskisi ile aynı olamaz!");
		}else {
			System.out.println("Yeni şifre oluşturuldu!");
		}
		break;
		
	case "hayır":
		System.out.println("Giriş yapılamadı!Şifrenizi veya kullaıcı adınzı doğru giriniz!");
		break;
	}
	
	}
}
}
