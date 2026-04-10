package tp3;

public class TestParking {
    public static void main(String[] args) {
      
        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("AB-098-CD", "Toyota", 5);
        v[1] = new Voiture("EF-234-GH", "BMW", 3);
        v[2] = new Moto("25-AB-19", "Yamaha", true);
        v[3] = new Camion("88-CC-99", "Mitsubishi", 18.5);

       
        System.out.println(" Tous les véhicules ");
        for (Vehicule vehicule : v) {
            vehicule.afficher();
            vehicule.stationner();
            System.out.println();
        }

        
        System.out.println(" Uniquement les voitures ");
        for (Vehicule vehicule : v) {
            if (vehicule instanceof Voiture) {
                vehicule.afficher();
                vehicule.stationner();
                System.out.println();
            }
        }

        
        System.out.println("Test downcasting");
        Vehicule x = new Moto("11C22", "Yamaha", true);
        
        if(x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : l'objet n'est pas une Voiture, downcasting impossible.");
        }
    }
}