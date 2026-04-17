package tp4;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() - montant < -decouvertAutorise) {
            System.out.println("impossible de retirer");
        } else {
            setSolde(getSolde() - montant);
    }
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Decouvert autorise : " + decouvertAutorise);
    }
}