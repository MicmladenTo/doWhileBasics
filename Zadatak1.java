package doWhileBasics;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int manjiBroj;
		int veciBroj;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		manjiBroj = scn.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		veciBroj = scn.nextInt();
		
		while (veciBroj >= manjiBroj) {
			System.out.println(veciBroj);
			veciBroj = veciBroj - 1;
		}
		
	}

}
//uneti dva broja s tastature (prvi je manji, drugi je veci) i napraviti while petlju koja ispisuje
//sve brojeve izmedju ukljucujuci i granicne vrednosti
//ako se unesu 4 i 8 ispisace se 4 5 6 7 8