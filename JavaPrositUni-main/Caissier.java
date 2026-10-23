public class Caissier extends Employe {
    private int caisse;

    public Caissier(int identifiant, String nom, String adresse, int nbHeuresParMois, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbHeuresParMois);
        this.caisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return caisse;
    }

    @Override
    public double calculerSalaire() {
        int heures = getNbHeuresParMois();
        if (heures <= 180) {
            return heures * 5.0;
        }
        return 180 * 5.0 + (heures - 180) * 5.0 * 1.15;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(", type=Caissier, numeroDeCaisse=" + caisse + "]");
    }
}