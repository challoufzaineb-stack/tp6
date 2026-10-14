package tp6;

public class Bibliotheque {

    private Document[] listdoc;
    private int nombreDocuments;
    private int capacite;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        listdoc = new Document[capacite];
        nombreDocuments = 0;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getNombre_document() {
        return nombreDocuments;
    }

    public void Ajout_doc(Document d) {
        if (nombreDocuments == capacite) {
            System.out.println("Bibliotheque pleine !");
            return;
        }

        int i = 0;

        while (i < nombreDocuments &&
               listdoc[i].getNumero() < d.getNumero()) {
            i++;
        }

        if (i < nombreDocuments &&
            listdoc[i].getNumero() == d.getNumero()) {
            System.out.println("Numero deja existant !");
            return;
        }

        for (int j = nombreDocuments; j > i; j--) {
            listdoc[j] = listdoc[j - 1];
        }

        listdoc[i] = d;
        nombreDocuments++;
    }

    public void Supprim_doc(int num) {
        int i = 0;

        while (i < nombreDocuments &&
               listdoc[i].getNumero() != num) {
            i++;
        }

        if (i == nombreDocuments) {
            System.out.println("Document introuvable !");
            return;
        }

        for (int j = i; j < nombreDocuments - 1; j++) {
            listdoc[j] = listdoc[j + 1];
        }

        listdoc[nombreDocuments - 1] = null;
        nombreDocuments--;
    }

    public void Inventaire_doc() {
        if (nombreDocuments == 0) {
            System.out.println("Bibliotheque vide !");
            return;
        }

        for (int i = 0; i < nombreDocuments; i++) {
            listdoc[i].Edition();
        }
    }

    public Bibliotheque liste_livre() {
        Bibliotheque b = new Bibliotheque(nombreDocuments);

        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i] instanceof Livre) {
                b.Ajout_doc(listdoc[i]);
            }
        }

        return b;
    }

    public Bibliotheque liste_article() {
        Bibliotheque b = new Bibliotheque(nombreDocuments);

        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i].getClass() == Article.class) {
                b.Ajout_doc(listdoc[i]);
            }
        }

        return b;
    }

    public Bibliotheque liste_docsimples() {
        Bibliotheque b = new Bibliotheque(nombreDocuments);

        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i].getClass() == Document.class) {
                b.Ajout_doc(listdoc[i]);
            }
        }

        return b;
    }

    public Bibliotheque liste_periodique() {
        Bibliotheque b = new Bibliotheque(nombreDocuments);

        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i] instanceof Periodique) {
                b.Ajout_doc(listdoc[i]);
            }
        }

        return b;
    }
}
