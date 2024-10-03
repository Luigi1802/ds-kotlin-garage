fun main() {
    // Instanciation du garage
    val monGarage = Garage();
    // Instanciation des véhicules
    val voiture1 = Voiture("Opel", 2004, "Gris", 4);
    val camion1 = Camion("Renault", 2005, "Jaune", 800);
    val moto1 = Moto("Yamaha", 2018, "Rouge", false);
    val voiture2 = Voiture("Ford", 2008, "Bleu", 2);
    val moto2 = Moto("Harley Davidson", 1994, "Noir", true);
    // Ajout des véhicules au garage
    monGarage.ajouterVehicule(voiture1);
    monGarage.ajouterVehicule(camion1);
    monGarage.ajouterVehicule(voiture2);
    monGarage.ajouterVehicule(moto2);
    monGarage.ajouterVehicule(moto1);
    // Affichage du garage
    monGarage.afficherGarage();
    // Klaxon des véhicules
    for (vehicule in monGarage.getVehicules()) {
        println("${vehicule::class.simpleName} fait :");
        vehicule.klaxonner();
    }
}