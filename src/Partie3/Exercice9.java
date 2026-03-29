package Partie3;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrice = new int[3][3];
		int somme = 0;

		System.out.println("Saisissez les éléments de la matrice 3x3 :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrice[i][j] = scanner.nextInt();
				somme += matrice[i][j];
			}
		}

		System.out.println("La somme des éléments est : " + somme);
		scanner.close();
	}

}
