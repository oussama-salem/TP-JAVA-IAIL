package TP1;
import java.util.Scanner;
public class Exercice14 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrer une chaine: ");
	        String ch = sc.nextLine();
	        String inverse = "";
	        for(int i = ch.length() - 1; i >= 0; i--) {
	            inverse += ch.charAt(i);
	        }
	        if(ch.equals(inverse))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Non palindrome");
	        
	        sc.close();
	    }
	 
}
