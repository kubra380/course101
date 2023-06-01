package calculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	int num1,num2,select;
	Scanner input=new Scanner(System.in);
	System.out.print("İlk sayıyı giriniz:");
	num1=input.nextInt();
	System.out.print("İkinci sayıyı giriniz:");
	num2=input.nextInt();
	System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
    System.out.println("İşlem seçiniz:");
    select=input.nextInt();
    switch(select){
    	case 1:
    		System.out.println("Toplama:"+(num1+num2));
    		break;
    	case 2:
    		System.out.println("Çıkarma:"+(num1-num2));
    		break;
    	case 3:
    		if(!(num2==0)) {
    		System.out.println("Bölme:"+(num1/num2));
    		}else {
    		System.out.println("Bir sayı sıfıra bölünemez!");
    		}
    		break;
    	case 4:
    		System.out.println("Çarpma:"+(num1*num2));
    		break;
    	default:
    	System.out.print("Yanlış işlem seçtiniz!");
    	
    	
    }
    
	}



}
