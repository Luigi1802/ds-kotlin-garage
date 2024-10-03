class Voiture : Vehicule {
    // attribut spécifique à Voiture
    private var nbPortes: Int = 0;

    // Constructeur
    constructor(marque: String, annee: Int, couleur: String, nbPortes: Int) : super(marque, annee, couleur) {
        this.nbPortes = nbPortes;
    }

    constructor()
    // Surcharge de la fonction afficherDetails()
    // pour rajouter l'attribut spécifique à Voiture
    override fun afficherDetails() {
        super.afficherDetails();
        println("Nombre de portes : $nbPortes")
    }

    // Implémentation de klaxonner() pour Voiture
    override fun klaxonner() {
        println("Tut tuut")
    }
}