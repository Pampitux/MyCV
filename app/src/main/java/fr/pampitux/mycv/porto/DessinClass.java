package fr.pampitux.mycv.porto;

public class DessinClass {

    int image;
    String texte;

    public DessinClass(int image, String texte) {
        this.image = image;
        this.texte = texte;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
