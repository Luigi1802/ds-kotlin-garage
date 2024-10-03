class Garage {
    // Liste mutable des vehicules
    // (les MutableList permettent de changer la taille de la collection si besoin)
    private var vehicules: MutableList<Vehicule> = ArrayList();

    // Méthode d'ajout d'un véhicule à la liste
    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule);
    }

    // Getter pour les véhicules
    fun getVehicules(): List<Vehicule> {
        return vehicules;
    }

    // Méthode pour afficher les détails de tous les véhicules
    fun afficherGarage() {
        var i = 0;
        println("- Garage :");
        // Boucle de parcours des véhicules
        while (i < vehicules.size) {
            // Affichage des détails
            println("Véhicule ${i+1} (${vehicules[i]::class.simpleName}):");
            vehicules[i].afficherDetails();
            i++;
        }
    }

}