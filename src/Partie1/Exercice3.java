package Partie1;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un nombre: ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		sc.close();

	}

}
