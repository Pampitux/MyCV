package fr.pampitux.mycv.contact;

public class ContactClass {

    String clef, valeur;
    int image, code;

    public ContactClass(String clef, int image, int code) {
        this.clef = clef;
        this.image = image;
        this.code = code;
    }

    public ContactClass(String clef, String valeur) {
        this.clef = clef;
        this.valeur = valeur;
    }

    public String getClef() {
        return clef;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public int getImage() {
        return image;
    }

    public int getCode() {
        return code;
    }

}
