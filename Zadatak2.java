package doWhileBasics;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ciljniBroj;
		int i = 0;
		int suma = 0;
		

		Scanner scn = new Scanner(System.in);

		System.out.println("Sabiramo do broja: ");
		ciljniBroj = scn.nextInt();

		while (i <= ciljniBroj) {
			suma = suma + i;
			i = i + 1;
		}
		System.out.println("Suma svih brojeva do unetog broja je: " + suma);
	}

}
//Napisati program koji sabira
//brojeve od 0 do broja koji ste uneli na tastaturi
//i prikazuje sumu

//suma = 0 + 1 + 2 + 3 + 4 + 5 = 15
//i 	= 0   1   2   3   4   5
//suma = 0       suma = 0
//suma = 1       suma = 0 + 1
//suma = 3       suma = 1 + 2
//suma = 6       suma = 3 + 3
//suma = 10      suma = 6 + 4
//suma = 15	   suma = 10 + 5