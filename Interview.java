import java.awt.*;
import java.util.Random;

public class Interview {
   public static void main (String args[]) {
      // Declare int array of size 10
      int array[] = new int[10];
//    Random rando = new Random();
/*
      for (int x = 0; x < 10; x++) {
         array[x] = rando.nextInt(99) + 1;
         System.out.println (array[x]);
      }
*/
      // Initialize array
      array[0] = 5;
      array[1] = 30;
      array[2] = 90;
      array[3] = 12;
      array[4] = 60;
      array[5] = 70;
      array[6] = 9;
      array[7] = 7;
      array[8] = 1;
      array[9] = 0;

      // Iteratre through I and J
      for (int i = 0; i < array.length; i++) {
         for (int j = i+1; j < array.length; j++) {
           
            // Store values at index i and j
            int iVal = array[i];
            int jVal = array[j];

            // Check for pairs
            if (iVal + jVal == 100) {
               System.out.println (iVal + " + " + jVal + " = 100!");
            }
         }
      }
   }
}
