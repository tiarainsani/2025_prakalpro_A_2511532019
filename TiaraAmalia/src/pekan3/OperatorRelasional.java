package pekan3;

import java.util.Scanner;

public class OperatorRelasional {
	public static void main (String[] args) {
		int A1;
		int A2;
		boolean hasil;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1");
		A1=keyboard.nextInt();
		System.out.println("input angka-2");
		A2=keyboard.nextInt();
		keyboard.close();
		hasil=A1>A2;//Apakah A1 lebih besar A2?
		System.out.println("A1>A2="+hasil);
		hasil=A1 < A2;//Apakah lebih kecil A2?
		System.out.println("A1<A2="+hasil);
		hasil=A1>=A2;//Apakah A1 lebih besar sama dengan A2
		System.out.println("A1>=A2="+hasil);
		hasil=A1<=A2;//Apakah A1 lebih kecil sama dengan A2?
		System.out.println("A1<=A2="+hasil);
		hasil=A1==A2;//Apakah A1 sama dengan A2?
		System.out.println("A1==A2="+hasil);
		hasil=A1!=A2;//Apakah A1 tidak sama dengan A2?
		System.out.println("A1!=A2="+hasil);
	}

}
