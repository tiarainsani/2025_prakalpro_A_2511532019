package pekan3;

import java.util.Scanner;

public class OperatorLogika {
	public static void main (String[] args) {
		boolean A1;
		boolean A2;
		boolean c;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input nilai boolean-1(True/False):");
		A1=keyboard.nextBoolean();//input 10
		System.out.println("input nilai boolean-2(True/False):");
		A2=keyboard.nextBoolean();
		keyboard.close();
		System.out.println("A1="+A1);
		System.out.println("A2="+A2);
		System.out.println("Konjungsi");
		c=A1&&A2;
		System.out.println("true and false"+c);
		System.out.println("Disjungsi");
		c=A1|A2;
		System.out.println("true and false"+c);
		System.out.println("Negasi");
		c=!A1;
		System.out.println("Bukan true"+c);
		//
	}

}
