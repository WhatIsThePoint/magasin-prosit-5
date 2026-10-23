public class Responsable extends Employe {
    private float prime;

    public Responsable(int identifiant, String nom, String adresse, int nbHeuresParMois, float prime) {
        super(identifiant, nom, adresse, nbHeuresParMois);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    @Override
    public double calculerSalaire() {
        int h = getNbHeuresParMois();
        double s;
        if (h <= 160) {
            s = h * 10.0;
        } else {
            s = 160 * 10.0 + (h - 160) * 10.0 * 1.20;
        }
        return s + prime;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(", type=Responsable, prime=" + prime + " DT]");
    }
}