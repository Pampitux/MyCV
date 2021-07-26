package fr.pampitux.mycv.cv;

public class CVItems {

    String titre;
    String description;

    public CVItems(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public CVItems() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
