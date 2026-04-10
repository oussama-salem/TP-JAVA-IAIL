package tp3;

public class Camion extends Vehicule {
    private double chargeMax;

    public Camion(String matricule, String marque, double chargeMax) {
        super(matricule, marque);
        this.chargeMax = chargeMax;
    }

    @Override
    public void stationner() {
        System.out.println("Le camion se gare dans une zone pour véhicules lourds.");
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Charge maximale : " + chargeMax + " tonne");
    }
}

