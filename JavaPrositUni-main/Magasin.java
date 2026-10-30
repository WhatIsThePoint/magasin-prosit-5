public class Magasin {
    private static final int MAX_PRODUITS = 2;
    private static final int MAX_EMPLOYES = 20;

    private int identifiant;
    private String nom;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private Employe[] employes;
    private int nb_produits;
    private int nb_employes;

    public Magasin(int identifiant, String nom, String adresse) {
        this(identifiant, nom, adresse, MAX_PRODUITS);
    }

    public Magasin(int identifiant, String nom, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = Math.min(capacite, MAX_PRODUITS);
        this.produits = new Produit[this.capacite];
        this.employes = new Employe[MAX_EMPLOYES];
        this.nb_produits = 0;
        this.nb_employes = 0;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getNombreProduits() {
        return nb_produits;
    }

    public int getNombreEmployes() {
        return nb_employes;
    }

    @Override
    public String toString() {
        return "Magasin{identifiant=" + identifiant + ", nom=" + nom
                + ", adresse=" + adresse + ", capacite=" + capacite
                + ", nombreProduits=" + nb_produits + ", nombreEmployes=" + nb_employes + "}";
    }

    public void ajouterProduit(Produit produit) throws MagasinPleinException, PrixNegatifException {
        if (produit.getPrix() < 0) {
            throw new PrixNegatifException("Le prix du produit " + produit.getLibelle() + " est négatif.");
        }
        if (nb_produits >= capacite) {
            throw new MagasinPleinException("Le magasin " + nom + " est plein.");
        }
        produits[nb_produits++] = produit;
    }

    public void ajouterEmploye(Employe employe) {
        if (nb_employes >= MAX_EMPLOYES) {
            System.out.println("Magasin " + nom + " : limite de " + MAX_EMPLOYES + " employes atteinte.");
            return;
        }
        employes[nb_employes++] = employe;
    }

    public void afficher() {
        System.out.println("=== Magasin " + identifiant + " ===");
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacite : " + capacite);

        System.out.println("Produits (" + nb_produits + ") :");
        for (int i = 0; i < nb_produits; i++) {
            System.out.println(" - " + produits[i].toString());
        }

        System.out.println("Employes (" + nb_employes + ") :");
        for (int i = 0; i < nb_employes; i++) {
            System.out.print(" - ");
            employes[i].afficher();
        }
    }

    public void afficherSalaires() {
        System.out.println("Salaires du magasin " + nom + " :");
        for (int i = 0; i < nb_employes; i++) {
            System.out.println(" - " + employes[i].getNom() + " : " + employes[i].calculerSalaire() + " DT");
        }
    }

    public void afficherPrimesResponsables() {
        System.out.println("Primes des responsables du magasin " + nom + " :");
        for (int i = 0; i < nb_employes; i++) {
            if (employes[i] instanceof Responsable) {
                Responsable responsable = (Responsable) employes[i];
                System.out.println(" - " + responsable.getNom() + " : " + responsable.getPrime() + " DT");
            }
        }
    }

    public void afficherNombreEmployesParType() {
        int nombreCaissiers = 0;
        int nombreVendeurs = 0;
        int nombreResponsables = 0;

        for (int i = 0; i < nb_employes; i++) {
            if (employes[i] instanceof Caissier) {
                nombreCaissiers++;
            } else if (employes[i] instanceof Vendeur) {
                nombreVendeurs++;
            } else if (employes[i] instanceof Responsable) {
                nombreResponsables++;
            }
        }

        System.out.println("Nombre d'employes par type dans le magasin " + nom + " :");
        System.out.println(" - Caissiers : " + nombreCaissiers);
        System.out.println(" - Vendeurs : " + nombreVendeurs);
        System.out.println(" - Responsables : " + nombreResponsables);
    }
}