package rectangle;

import java.io.Serializable;

/**
 *
 * @author dmr
 */
public class Rectangle implements Serializable {
    
    private int longueur;
    private int largeur;
    private static int count = 0;
   
    // Constructeur par défaut
    public Rectangle() {
        System.out.println("Création du rectangle par défaut");
        longueur = 0;
        largeur = 0;
        count++;
    }
    
    // Constructeur avec paramètres
    public Rectangle(int longueur, int largeur) {
        System.out.println("Création d'un rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
        count++;
    }
    
    @Override
    public String toString() {        
        return "Je suis un Rectangle de longueur " + this.longueur + " cm et de largeur " + this.largeur + " cm";
    }

    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        
        // Convertie obj, intance de classe Object, en Rectangle
        Rectangle rectangleComp = (Rectangle)obj;
        
        if (rectangleComp.longueur == this.longueur 
                && rectangleComp.largeur == this.largeur) {
            ret = true;
        }
        
        return ret;
    }
    
    public int getLongueur() {
        return longueur;
    }
    
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    public int getSurface() {
        return longueur * largeur;
    }
    
    public int getPerimetre() {
        return (longueur + largeur) * 2;
    }
    
    public static int getNbRectangle() {
        return count;
    }
    
}
