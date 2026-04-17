package tp4;

public class TestBanque {

    public static void main(String[] args) {
        Compte[] cmpt = new Compte[4];

        cmpt[0] = new CompteCourant("12345", "oussama", 10000, 200);
        cmpt[1] = new CompteEpargne("89899", "oussa ait salem", 500, 2);
        cmpt[2] = new ComptePremium("1234", "brahim lfourat", 700, 2000);
        cmpt[3] = new CompteCourant("9876", "hanane", 4000, 6000);

        
        System.out.println(" Depot de 100   ");
        for (Compte c : cmpt) {
            c.deposer(100);
            c.afficher();
            System.out.println("\n");
        }

        
        System.out.println("\n Retrait de 1000   ");
        for (Compte c : cmpt) {
            c.retirer(1000);
            c.afficher();
            System.out.println("\n");
        }

        
        System.out.println("\nComptes Epargn");
        for (Compte c : cmpt) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }

        System.out.println("\n Test instanceof ");
        Compte c = new CompteEpargne("12990", "sofuane mamado", 500, 2);
        if (c instanceof CompteCourant) {
            
            CompteCourant cc = (CompteCourant) c;
            cc.afficher();
        } else {
            System.out.println("c n'est pas un CompteCourant");
        }
    }
}