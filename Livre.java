package tp6;

public class Livre extends Article {
    private String editeur;

    public Livre(String titre, int numero, int pages, String auteur, String editeur) {
        super(titre, numero, pages, auteur);
        this.editeur = editeur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getType() {
        return "Livre";
    }

    public void Edition() {
        super.Edition();
        System.out.println("Editeur : " + editeur);
    }
}
