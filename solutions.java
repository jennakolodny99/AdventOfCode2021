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

/* Day 3 Part 1
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;


public class solution{
    public static void main(String[] args){

        
        try {
            // open file to read
            Scanner scanner = new Scanner(new File("input4.txt"));
        
            //get the length of the binary string
            String binaryString = scanner.nextLine();
            int length = binaryString.length();
            Vector<Integer> v = new Vector<>();
            v.add(-1); //do this to start the indexing at 1 for math purposes 
            for (int i = 0; i < length; i++) {
                char c = binaryString.charAt(i);
                int value = Character.getNumericValue(c);
                v.add(value);

            }
            
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                for (int i = 0; i < length; i++){
                    char c = s.charAt(i);
                    int value = Character.getNumericValue(c);
                    v.add(value);
                }
            }
            
            int vectorLength = v.size() - 1; //subtract 1 because we have -1 at index 0
            int numOfStrings = vectorLength / length; //this is the number of binary strings 
            int [] gamma = new int[length + 1];
            gamma[0] = -1; //use as placeholder to start indexing at 1
            for (int i = 1; i <= length; i++){
                    int zeroCount = 0;
                    int oneCount = 0;
                for (int j = i; j < v.size(); j+= length){
                    int x = v.get(j);
                    if (x == 0){
                        zeroCount++;
                    }
                    else{
                        oneCount++;
                    }
                }//for
                if (zeroCount > oneCount){
                    gamma[i] = 0;
                }
                else{
                    gamma[i] = 1;
                }
            }//for


            int [] epsilon = new int[length + 1];
            epsilon[0] = -1;
            
            for (int i = 1; i < gamma.length; i++){
                if (gamma[i] == 0){
                    epsilon[i] = 1;
                }
                else{
                    epsilon[i] = 0;
                }
            }

           

            String gammaString = "";
            String epsilonString = "";
            for (int i = 1; i < gamma.length; i++){
                char g = Character.forDigit(gamma[i], 10);
                gammaString = gammaString + g;
                char e = Character.forDigit(epsilon[i], 10);
                epsilonString = epsilonString + e;
            }

            int gammaValue = Integer.parseInt(gammaString, 2);
            int epsilonValue = Integer.parseInt(epsilonString, 2);

            System.out.println(gammaValue * epsilonValue);
            
        
            // close the scanner
            scanner.close();
                
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
*/ 
