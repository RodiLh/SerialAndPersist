package carre;


/**
 *
 * @author dmr
 */
public class Carre extends rectangle.Rectangle {
    
    private int cote;
    
    public Carre() {
        super();
        System.out.println("Création d'un carré par défaut");
    }
    
    public Carre(int cote) {
        super(cote, cote);
        System.out.println("Création d'un carré");
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Je suis un Carre de coté " + cote + " cm";
    }
    
    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }
    
}
