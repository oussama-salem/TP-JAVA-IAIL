package tp2.partie2;

import tp2.partie1.CompteBancaire; 

//Question1
public class Banque {

private String nom;
private CompteBancaire[] comptes;
private int nbActuels;

// Question2
public Banque(String nom, int capacite) {
   this.nom = nom;
   this.comptes = new CompteBancaire[capacite];
   this.nbActuels = 0;
}

// Question3
public void ajouterCompte(CompteBancaire c) {
   if (nbActuels < comptes.length) {
       comptes[nbActuels] = c;
       nbActuels++;
       System.out.println("Compte ajoute");
   } else {
       System.out.println("Banque pleine");
   }
}

public void afficherTous() {
   for (int i = 0; i < nbActuels; i++) {
       comptes[i].afficher();
   }
}
}