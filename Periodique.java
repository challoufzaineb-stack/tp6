package tp6;

public class Periodique extends Document {
    private String frequence;

    public Periodique(String titre, int numero, int pages,
                      String frequence) {
        super(titre, numero, pages);
        this.frequence = frequence;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getType() {
        return "Periodique";
    }

    public void Edition() {
        super.Edition();
        System.out.println("Frequence : " + frequence);
    }
}
