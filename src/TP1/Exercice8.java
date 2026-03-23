package TP1;
import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int[][] mat = new int[3][3];
	        System.out.println("Remplir la matrice:");
	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                System.out.print("mat[" + i + "][" + j + "] = ");
	                mat[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Matrice:");
	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }
	        sc.close();

	}

}
