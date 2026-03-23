package TP1;


import java.util.Scanner;

public class Exercice13 {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrer une chaine: ");
	        String ch = sc.nextLine();
	        String inverse = "";
	        for(int i = ch.length() - 1; i >= 0; i--) {
	            inverse += ch.charAt(i);
	        }
	        System.out.println("Inverse: " + inverse);
	        sc.close();
	    }
}
