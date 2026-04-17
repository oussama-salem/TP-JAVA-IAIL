package tp4;

public class ComptePremium extends Compte {
    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafond) {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafond;
    }

    @Override
    public void retirer(double montant) {
        if (montant > plafondRetrait) {
            System.out.println("Impossible  montant supérieur au plafond autorisé.");
        } else if (montant > getSolde()) {
            System.out.println("Impossible  solde insuffisant.");
        } else {
            
            super.retirer(montant);
            
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Plafond de retrait : " + plafondRetrait);
    }
}