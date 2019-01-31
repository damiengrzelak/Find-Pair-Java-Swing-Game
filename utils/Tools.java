package utils;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author damian
 */
public abstract class Tools {
     
    
    public static void exitGame(){
        System.exit(0);
    }
    
    public ArrayList<URL> arrayOfImages() {
        ArrayList<URL> imageList = new ArrayList<>();
//        imageList.add(getClass().getResource("/resources/bulba.png"));
//        imageList.add(getClass().getResource("/resources/squirtle.png"));
//        imageList.add(getClass().getResource("/resources/charm.png"));
//        imageList.add(getClass().getResource("/resources/pika.png"));
//        imageList.add(getClass().getResource("/resources/evee.png"));
//        imageList.add(getClass().getResource("/resources/poke.png"));
        
        return imageList;
    }
    
    public ArrayList<URL> getDataFromFile(String fileName) {
        ArrayList<URL> imageList = new ArrayList<>();
       try {
         File file = new File(fileName);
         Scanner scanner = new Scanner(file);
         while (scanner.hasNextLine()) {
           imageList.add(getClass().getResource(scanner.nextLine()));
         }
         scanner.close();
       } catch (FileNotFoundException e) {
         e.printStackTrace();
       }
       return imageList;
     }
    
    public ArrayList<Integer> arrayOfCardIds(){
        return new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    }
    
    public static Icon resizeIcon(ImageIcon icon) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
}
