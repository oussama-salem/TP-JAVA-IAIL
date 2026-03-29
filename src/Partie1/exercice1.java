package Partie1;

import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un nombre : ");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println("Positif");
		} else if (n < 0) {
			System.out.println("Negatif");
		} else {
			System.out.println("Nul");
		}
		sc.close();

	}

}
