package TP1;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Donner N: ");
	        int N = sc.nextInt();
	        int[] tab = new int[N];
	        for(int i = 0; i < N; i++) {
	            System.out.print("Element " + i + " : ");
	            tab[i] = sc.nextInt();
	        }
	        int max = tab[0];

	        for(int i = 1; i < N; i++) {
	            if(tab[i] > max)
	                max = tab[i];
	        }
	        System.out.println("Le plus grand element est: " + max);
	        sc.close();

	}

}
