import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;



public class LoopMap
{  
   

    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        List<Integer> intList = new ArrayList <Integer>();
        
        for(int i=0; i<5; ++i)
        {
            System.out.println("Input a number, please.");
            Integer value = Integer.parseInt(scan.nextLine());
            intList.add(value);
        }
       
        
        Integer[] intArray = intList.toArray(new Integer[0]);
        
        Arrays.sort(intArray);
        
        
        int sum = intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4];
                
        int product = intArray[0] * intArray[1] * intArray[2] * intArray[3] * intArray[4];
        
        
        System.out.println("The sum of all numbers is: " + sum);
        System.out.println("The product of all numbers is: " + product);
        System.out.println("Minimum: " + intArray[0]);
        System.out.println("Maximum: " + intArray[intArray.length-1]);
     
     }
        
        
        
 }
    



