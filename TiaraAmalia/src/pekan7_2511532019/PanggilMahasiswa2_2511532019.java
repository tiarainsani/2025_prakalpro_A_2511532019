package pekan7_2511532019;

import java.util.Scanner;

public class PanggilMahasiswa2_2511532019 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("NIM: ");;
		String x= input.nextLine();
		System.out.println("Nama: ");
		String y= input.nextLine();
		Mahasiswa_2511532019 a= new Mahasiswa_2511532019();
		a.setNim2(x);
		a.setNama(y);
		if (x.startsWith("25")) {
			System.out.println(y+" anda angkatan 2025");
		}
		if (x.contains("1153")) {
			System.out.println("Anda mahasiswa informatika");
		}
		a.Cetak2();
		input.close();
	}

}
//Tiara Amalia Insani_2511532019
