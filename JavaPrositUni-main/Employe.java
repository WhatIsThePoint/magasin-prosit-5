public abstract class Employe {
    private int id;
    private String nom;
    private String adresse;
    private int nb_heures;

    public Employe(int identifiant, String nom, String adresse, int nbHeuresParMois) {
        this.id = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nbHeuresParMois;
    }

    public int getIdentifiant() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbHeuresParMois() {
        return nb_heures;
    }

    public abstract double calculerSalaire();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employe employe = (Employe) o;
        return nb_heures == employe.nb_heures
                && Double.compare(calculerSalaire(), employe.calculerSalaire()) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nb_heures, calculerSalaire());
    }

    public void afficher() {
        System.out.print("Employe [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbHeures=" + nb_heures);
    }
}