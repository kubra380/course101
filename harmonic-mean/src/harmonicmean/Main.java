package harmonicmean;


import java.util.Scanner;

//harmonic ortalama bulan program
public class Main {

	public static void main(String[] args) {

		double[] list = new double[10];
		double sum =0.0;
		double averega =0.0;
		for (double i =1 ; i< list.length+1 ; i++) {
			sum +=1/i;
		}
	
		averega = (list.length/sum);
		System.out.println("Harmonik Ortalama :" +averega);	
	}

}
