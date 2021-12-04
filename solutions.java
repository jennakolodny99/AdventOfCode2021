/* Day 1 Part 
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
*/ 

/* Day 1 Part 2

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
            
            for (int j = 2; j < depths.length - 1; j++){
                //System.out.println(depths[j]);
                if ((depths[j+1] + depths[j] + depths[j-1]) - (depths[j] + depths[j-1] + depths[j-2]) > 0){
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

*/

/* Day 2 Part 2
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;


public class solution{
    public static void main(String[] args){

        
        try {
            // open file to read
            Scanner scanner = new Scanner(new File("input3.txt"));
        
            // read until end of file (EOF)
            
            int depth = 0;
            int horizontal = 0;
            int aim = 0;
            
            while (scanner.hasNextLine()) {
                String direction = scanner.next();
                int value = scanner.nextInt();
                if (direction.equals("forward")){
                    horizontal = horizontal +  value;
                    depth = depth + (aim * value);
                }
                else if (direction.equals("down")) {
                    aim = aim + value;
                }
                else if (direction.equals("up")){
                    aim = aim - value;
                }
            }
            System.out.println(depth);
            System.out.println(horizontal);
            System.out.println(depth * horizontal);
            
            
        
            // close the scanner
            scanner.close();
                
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
*/ 
