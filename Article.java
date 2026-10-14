package tp6;

public class Article extends Document {
    private String auteur;

    public Article(String titre, int numero, int pages, String auteur) {
        super(titre, numero, pages);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getType() {
        return "Article";
    }

    public void Edition() {
        super.Edition();
        System.out.println("Auteur : " + auteur);
    }
}
