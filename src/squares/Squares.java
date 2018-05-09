/*
 * This program was created to take multiple 
 * numbers and display them along with the squares 
 * of them
 */

package squares;
import java.util.ArrayList;
/**
 * May 9, 2018
 * @author seden0957
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> indexSquare = new ArrayList();
        System.out.println("Squares ArrayList\n*****************");
        for(int i =0; i<10; i++)
        {
            indexSquare.add(i,i*i);
        }
        for(int i=0; i < 10; i++)
        {
          System.out.println("Number: " + i + " Square: " + indexSquare.get(i));
        }
           
        }
    }
    

