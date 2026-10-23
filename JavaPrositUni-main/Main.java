public class Main {

    public static void main(String[] args) {
        Magasin m1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6");

        Caissier c1 = new Caissier(101, "Ali", "Tunis", 175, 1);
        Caissier c2 = new Caissier(102, "Sara", "Ariana", 190, 2);
        Vendeur v1 = new Vendeur(103, "Mourad", "Bardo", 150, 75.0f);
        Responsable r1 = new Responsable(104, "Leila", "Marsa", 168, 250.0f);

        Caissier c3 = new Caissier(201, "Nabil", "Ben Arous", 180, 3);
        Vendeur v2 = new Vendeur(202, "Ines", "Manouba", 140, 60.0f);
        Vendeur v3 = new Vendeur(203, "Rami", "Sfax", 155, 82.0f);
        Vendeur v4 = new Vendeur(204, "Salma", "Sousse", 160, 90.0f);
        Responsable r2 = new Responsable(205, "Hichem", "Nabeul", 172, 300.0f);

        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(c2);
        m1.ajouterEmploye(v1);
        m1.ajouterEmploye(r1);

        m2.ajouterEmploye(c3);
        m2.ajouterEmploye(v2);
        m2.ajouterEmploye(v3);
        m2.ajouterEmploye(v4);
        m2.ajouterEmploye(r2);

        System.out.println("=== Employes crees ===");
        Employe[] list = {c1, c2, v1, r1, c3, v2, v3, v4, r2};
        for (Employe e : list) {
            e.afficher();
        }

        Produit p1 = new Produit(1, "Lait", "Delice", 1.2f);
        Produit p2 = new Produit(2, "Yaourt", "Vitalait", 0.8f);
        Produit p3 = new Produit(3, "Fromage", "President", 6.5f);
        Produit p4 = new Produit(4, "Jus", "Boga", 2.0f);
        Produit p5 = new Produit(5, "Eau", "Safia", 0.7f);
        Produit p6 = new Produit(6, "Biscuits", "Bimo", 3.4f);

        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);

        m2.ajouterProduit(p4);
        m2.ajouterProduit(p5);
        m2.ajouterProduit(p6);

        System.out.println();
        m1.afficher();
        System.out.println();
        m2.afficher();

        System.out.println();
        m1.afficherSalaires();
        m1.afficherPrimesResponsables();
        m1.afficherNombreEmployesParType();
        System.out.println();
        m2.afficherSalaires();
        m2.afficherPrimesResponsables();
        m2.afficherNombreEmployesParType();
    }
}
