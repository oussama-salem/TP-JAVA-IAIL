package tp3;

public class Vehicule {
    protected String matricule;
    protected String marque;

    public Vehicule(String matricule, String marque) {
        this.matricule = matricule;
        this.marque = marque;
    }

    public void stationner() {
        System.out.println("Le véhicule se gare dans le parking.");
    }

    public void afficher() {
        System.out.println("Matricule : " + matricule + ", Marque : " + marque);
    }
}