import java.util.Date;

public class Produit {
    int id; String libelle; String marque; float prix; Date dateExpiration;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("id : " + id+" libelle : " + libelle+" marque : " + marque+" prix : " + prix+" date d'expiration : " + dateExpiration);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }
    //7 Solution
    @Override
    public String toString() {
        return "Produit{id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", dateExpiration=" + dateExpiration + "}";

    }
}
