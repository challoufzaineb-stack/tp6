package tp6;

public class main {

    public static void main(String[] args) {

        Bibliotheque b = new Bibliotheque(10);

        Document d1 = new Document("Document A", 4, 100);
        Article a1 = new Article("Article B", 2, 20, "Ahmed");
        Livre l1 = new Livre("Livre C", 1, 300, "Ali", "Dar Tunis");
        Periodique p1 = new Periodique("Magazine D", 3, 50, "Mensuelle");

        b.Ajout_doc(d1);
        b.Ajout_doc(a1);
        b.Ajout_doc(l1);
        b.Ajout_doc(p1);

        System.out.println(" Inventaire ");
        b.Inventaire_doc();

        System.out.println("\n Livres ");
        b.liste_livre().Inventaire_doc();

        System.out.println("\n Articles ");
        b.liste_article().Inventaire_doc();

        System.out.println("\n Documents simples ");
        b.liste_docsimples().Inventaire_doc();

        System.out.println("\n Periodique ");
        b.liste_periodique().Inventaire_doc();

        System.out.println("\n Suppression du document 3 ");
        b.Supprim_doc(3);
        b.Inventaire_doc();
    }
}
