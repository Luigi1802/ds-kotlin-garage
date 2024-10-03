class Camion : Vehicule {
    // attribut spécifique à Camion
    private var capaciteKg: Int = 0;

    // Constructeur
    constructor(marque: String, annee: Int, couleur: String, capaciteKg: Int) : super(marque, annee, couleur) {
        this.capaciteKg = capaciteKg;
    }

    // Surcharge de la fonction afficherDetails()
    // pour rajouter l'attribut spécifique à Camion
    override fun afficherDetails() {
        super.afficherDetails();
        println("Capacité de chargement (kg) : $capaciteKg")
    }

    // Implémentation de klaxonner() pour Camion
    override fun klaxonner() {
        println("TOOON TOOOOOOOON")
    }
}