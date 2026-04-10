package tp3;

public class Moto extends Vehicule {
    private boolean avecCasque;

    public Moto(String matricule, String marque, boolean avecCasque) {
        super(matricule, marque);
        this.avecCasque = avecCasque;
    }

    @Override
    public void stationner() {
        System.out.println("La moto se gare dans une place réservée aux deux-roues.");
    }

    @Override
    public void afficher() {
        super.afficher();
        if(avecCasque) {
            System.out.println("Casque fourni : oui");}
        else {
        	 System.out.println("Casque fourni : NO");
        }
        

    
    }
}