package tp6;

public class Document {
    private String titre;
    private int numero;
    private int pages;

    public Document(String titre, int numero, int pages) {
        this.titre = titre;
        this.numero = numero;
        this.pages = pages;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumero() {
        return numero;
    }

    public int getPages() {
        return pages;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getType() {
        return "Document simple";
    }

    public void Edition() {
        System.out.println("Type : " + getType());
        System.out.println("Titre : " + titre);
        System.out.println("Numero : " + numero);
        System.out.println("Nombre de pages : " + pages);
    }
}
