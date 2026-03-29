package Partie1;

import java.util.Scanner;

public class exercice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer N: ");
		int N = sc.nextInt();
		int i = 1;
		int somme = 0;
		while (i <= N) {
			somme = somme + i;
			i++;
		}
		System.out.println("Somme = " + somme);
		sc.close();
	}
}
