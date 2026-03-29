package Partie3;

import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nombre de lignes : ");
		int lignes = scanner.nextInt();
		System.out.print("Nombre de colonnes : ");
		int colonnes = scanner.nextInt();

		int[][] matrice = new int[lignes][colonnes];
		System.out.println("Saisissez les éléments :");
		for (int i = 0; i < lignes; i++) {
			for (int j = 0; j < colonnes; j++) {
				matrice[i][j] = scanner.nextInt();
			}
		}

		System.out.println("La matrice transposée est :");
		for (int j = 0; j < colonnes; j++) {
			for (int i = 0; i < lignes; i++) {
				System.out.print(matrice[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();
	}

}
