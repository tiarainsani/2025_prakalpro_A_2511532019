package pekan4;

import java.util.Scanner;

public class Ifelse1 {
	public static void main (String[] args) {
		double IPK;
		Scanner input=new Scanner(System.in);
		System.out.println("Input IPK Anda=");
		IPK=input.nextDouble();
		input.close();
		if(IPK>2.75) {
			System.out.println("Anda Lulus Sangat Memuaskan dengan IPK"+IPK);
		} else {
			System.out.println	("Anda Tidak Lulus");
			}
		}
	}



