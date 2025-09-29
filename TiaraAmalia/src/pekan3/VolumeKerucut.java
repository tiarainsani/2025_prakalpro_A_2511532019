package pekan3;

import java.util.Scanner;

public class VolumeKerucut {

	public static void main(String[] args) {
		//deklarasi variabel
		double r,t,V;
		final double PI = 3.14;
		//input dari user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Masukkan jari-jari kerucut:");
		r=keyboard.nextDouble();
		System.out.println("Masukkan tinggi kerucut:");
		t=keyboard.nextDouble();
		keyboard.close();
		//proses hitung volume kerucut
		V=(1.0/3.0)*PI*r*r*t;
		//output hasil
		System.out.println("Volume kerucut ="+V);
	}

}
