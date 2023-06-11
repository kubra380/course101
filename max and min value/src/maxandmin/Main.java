package maxandmin;
import java.util.*;

public class Main {

	//girilen sayıya en yakın,en küçük ve en büyük değeri bulan program
	
	public static void main(String[] args) {
		
		int list[]= {15,12,788,1,-1,-778,2,0};
	
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		System.out.print("Sayi Giriniz:");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		int max=number;
		int min=number;
		
		for(int value:list) {
		if(value>number) {
			max=value;
			break;
		}
		}
		for(int value:list) {
			if(value<number) {
				min=value;
			}
		}
		System.out.println("en yakın en büyük:"+max);
		System.out.println("en yakın en büyük:"+min);
		
		input.close();
	}

}
