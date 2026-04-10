package tp3;

public class Voiture extends Vehicule {
    private int nbPortes;

    public Voiture(String matricule, String marque, int nbPortes) {
        super(matricule, marque);
        this.nbPortes = nbPortes;
    }

    @Override //Annotation Java pour indiquer la redéfinition
    public void stationner() {
        System.out.println("La voiture se gare dans une place standard.");
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Nombre de portes : " + nbPortes);
    }
}