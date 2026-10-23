public class Vendeur extends Employe {
    private float taux;

    public Vendeur(int identifiant, String nom, String adresse, int nbHeuresParMois, float tauxDeVente) {
        super(identifiant, nom, adresse, nbHeuresParMois);
        this.taux = tauxDeVente;
    }

    public float getTauxDeVente() {
        return taux;
    }

    @Override
    public double calculerSalaire() {
        return 450.0 * taux / 100.0;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(", type=Vendeur, tauxDeVente=" + taux + "%]");
    }
}