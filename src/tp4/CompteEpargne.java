package tp4;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInteret() {
       
        setSolde(getSolde() * (1 + tauxInteret));
    }

    @Override
    public void retirer(double montant) {
        if (montant > getSolde()) {
            System.out.println("Impossible solde insuffisant");
        } else {
            super.retirer(montant); 
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Taux d'intérêt : " + (tauxInteret * 100) + "%");
    }
}