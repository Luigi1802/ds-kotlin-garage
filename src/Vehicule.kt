abstract class Vehicule() {
    // attributs généraux
    private var marque: String = "";
    private var annee: Int = 0;
    private var couleur: String = "";

    // Constructeur
    constructor(marque: String, annee: Int, couleur: String) : this() {
        this.marque = marque;
        this.annee = annee;
        this.couleur = couleur;
    }

    // Affichage des détails généraux du véhicule
    open fun afficherDetails() {
        println("Marque : $marque")
        println("Année : $annee")
        println("Couleur : $couleur")
    }

    // - Fonction abstraite klaxonner
    // elle sera modifiée dans chaque type de véhicule
    // pour produire un son différent
    abstract fun klaxonner();
}