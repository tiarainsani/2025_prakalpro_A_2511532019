package pekan6_2511532019;

import java.util.Scanner;

public class perulanganWhile1_2511532019 {
	
public static void main (String[] args) {
	 int counter=0;
	 String jawab;
	 boolean running=true;
	 //deklarasi Scanner
	 Scanner scan = new Scanner(System.in);
	 while (running) {
		 counter ++;
		 System.out.println("jumlah="+ counter);
		 System.out.print("apakah lanjut (ya/tidak?)");
		 jawab=scan.nextLine();
		 //cek jawab=tidak, perulangan berhenti
		 if (jawab.equalsIgnoreCase("tidak")) {
			 running=false;
		 }
	 }
	 System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+" kali");	 
 }
}
