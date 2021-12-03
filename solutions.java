/* Day 1 Part 1*/
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;


public class solution{
    public static void main(String[] args){

        
        try {
            // open file to read
            Scanner scanner = new Scanner(new File("input.txt"));
        
            // read until end of file (EOF)
            int counter = 0;
            int i = 0;
            int [] depths = new int[2000];
            while (scanner.hasNextLine()) {
                int value = scanner.nextInt();
               // System.out.println(value);
                depths[i] = value;
                i++;
                
                
            }
            
            for (int j = 0; j < depths.length - 1; j++){
                //System.out.println(depths[j]);
                if (depths[j+1] - depths[j] > 0){
                    counter++;
                }
            }
            System.out.println(counter);
            
        
            // close the scanner
            scanner.close();
                
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
