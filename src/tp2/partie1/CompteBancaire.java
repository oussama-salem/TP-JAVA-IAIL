package tp2.partie1;

//Question1
public class CompteBancaire {

 // Question2
 private int numero;
 private String titulaire;
 private double solde;
 private double decouvertAutorise;

 // Q3uestion3
 private static int nbComptes = 0;
 private static double tauxInteretAnnuel = 0.03;

 // Question4
 public CompteBancaire() {
     this.numero = nbComptes++;
     this.titulaire = "";
     this.solde = 0;
     this.decouvertAutorise = 0;
 }

 // Question5
 public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
     this.numero = nbComptes++;
     this.titulaire = titulaire;
     this.solde = solde;
     this.decouvertAutorise = decouvertAutorise;
 }

 // Question6
 public int getNumero() {
     return numero;
 }

 public String getTitulaire() {
     return titulaire;
 }

 public double getSolde() {
     return solde;
 }

 public double getDecouvertAutorise() {
     return decouvertAutorise;
 }

 public void setTitulaire(String titulaire) {
     if (titulaire != null && !titulaire.equals("")) {
         this.titulaire = titulaire;
     } else {
         System.out.println("Titulaire invalide");
     }
 }

 public void setDecouvertAutorise(double decouvertAutorise) {
     if (decouvertAutorise >= 0) {
         this.decouvertAutorise = decouvertAutorise;
     } else {
         System.out.println("Decouvert invalide");
     }
 }

 // Question7
 public void afficher() {
     System.out.println("=== Compte ===");
     System.out.println("Numero : " + numero);
     System.out.println("Titulaire : " + titulaire);
     System.out.println("Solde : " + solde + " MAD");
     System.out.println("Decouvert : " + decouvertAutorise + " MAD");
     System.out.println("==============");
 }

 // Question8
 public void deposer(double montant) {
     if (montant > 0) {
         solde += montant;
         System.out.println("Depot effectue");
     } else {
         System.out.println("Montant de depot invalide");
     }
 }

 public void retirer(double montant) {
     if (montant > 0 && montant <= solde + decouvertAutorise) {
         solde -= montant;
         System.out.println("Retrait effectue");
     } else {
         System.out.println("Retrait refuse");
     }
 }

 public void virementVers(CompteBancaire autre, double montant) {
     if (montant > 0 && montant <= solde + decouvertAutorise) {
         this.retirer(montant);
         autre.deposer(montant);
         System.out.println("Virement effectue");
     } else {
         System.out.println("Virement impossible");
     }
 }

 // Question9
 public double calculerSoldeAvecInterets() {
     return this.solde * (1 + tauxInteretAnnuel);
 }

 public double calculerSoldeAvecInterets(double bonus) {
     return this.solde * (1 + tauxInteretAnnuel + bonus);
 }

 // Question10
 public static int getNbComptes() {
     return nbComptes;
 }

 public static double getTauxInteretAnnuel() {
     return tauxInteretAnnuel;
 }

 public static void setTauxInteretAnnuel(double tauxInteret) {
     tauxInteretAnnuel = tauxInteret;
 }
}
