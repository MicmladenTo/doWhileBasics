package doWhileBasics;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int petlja = 0;
	
		do {
			i = i + 5;
			petlja = petlja + 1;
			System.out.println("Vrednost promenljive je " + i + ". Ušao sam u petlju " + petlja + ". put.");
		} while ( i < 50);
	}

}
//napisati program koji ispisuje svaki peti broj izmedju 10 i 50
		//(takodje ispisuje koji put ste usli u petlju)
		// primer resenja je:
		//vrednost promenljive je 10 usao sam u petlju 1.put
		// vrednost promenljive je 15 usao sam u petlju 2.put
		//...sve tako do 50 (ukljucujuci i 50)