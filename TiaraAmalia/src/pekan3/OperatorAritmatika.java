package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {
	public static void main(String[]args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("input angka-1");
		A1=keyboard.nextInt();
		A2=keyboard.nextInt();
		keyboard.close();
		System.out.println("Operator Penjumlahan");
		hasil=A1+A2;//Penjumlahan
		System.out.println("Hasil="+hasil);
		System.out.println("Operasi Pengurangan");
		hasil=A1-A2;//Pengurangan
		System.out.println("Hasil="+hasil);
		System.out.println("Operasi Perkalian");
		hasil=A1*A2;//Perkalian
		System.out.println("hasil="+hasil);
		System.out.println("Operasi hasil bagi");
		hasil=A1/A2;//Pembagian
		System.out.println("hasil="+hasil);
		System.out.println("Operasi sisa bagi");
		System.out.println("hasil="+hasil);
	}

}
