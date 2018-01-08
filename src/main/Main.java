package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import rectangle.Rectangle;

/**
 *
 * @author dmr
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(4, 7);
        
        // Ecriture d'un objet dans un fichier
        try {
            FileOutputStream fos = new FileOutputStream("rectangles.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(r);
            oos.close();
            
        } catch (IOException e) {
            System.err.println("Erreur : " + e);
        }
        
        // Lecture d'un fichier contenant un objet
        try {            
            FileInputStream fis = new FileInputStream("rectangles.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
           
            // On créé un nouvel objet Rectangle à partir du fichier
            Rectangle r2 = (Rectangle) ois.readObject();
            System.out.println(r2);
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur : " + e);
        }   
        
    }
}
