class Moto : Vehicule {
    // attribut spécifique à Moto
    private var isSidecar: Boolean = false;

    // Constructeur
    constructor(marque: String, annee: Int, couleur: String, isSidecar: Boolean) : super(marque, annee, couleur) {
        this.isSidecar = isSidecar;
    }

    // Surcharge de la fonction afficherDetails()
    // pour rajouter l'attribut spécifique à Moto
    override fun afficherDetails() {
        super.afficherDetails();
        if (isSidecar) println("Possède un sidecar") else println("Ne possède pas de sidecar")
    }

    // Implémentation de klaxonner() pour Moto
    override fun klaxonner() {
        println("bip biip")
    }
}