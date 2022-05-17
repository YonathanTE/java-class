/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yonathan
 */
import java.util.*;
public class WindowMaster {
    public static void main(String [] args) {
        // height & width variables
        try {    
        float height;
        float width;
        float windowGlass;
        float windowTrim;
        float windowCount;
        
        // String variables to be the input(s)
        String strHeight;
        String strWidth;
        String strGlass;
        String strTrim;
        String strWindows;
        
        float windowArea;
        float glass;
        float trim;
        float cost;
        float perimeterWindow;
        float windows = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Please enter the window height: ");
        strHeight = myScanner.nextLine();
        System.out.println("Please enter the window width: ");
        strWidth = myScanner.nextLine();
        System.out.println("Please enter the cost of glass: ");
        strGlass = myScanner.nextLine();
        System.out.println("Please enter the cost of trim: ");
        strTrim = myScanner.nextLine();
        System.out.println("Please enter the number of windows: ");
        strWindows = myScanner.nextLine();
        
        // Convert the input(s) into float values
        height = Float.parseFloat(strHeight);
        width = Float.parseFloat(strWidth);
        glass = Float.parseFloat(strGlass);
        trim = Float.parseFloat(strTrim);
        
        // Area of the window
        windowArea = height * width;
        
        // Perimeter of the window
        perimeterWindow = 2 * (height + width);
        
        // Calculation for total cost
        cost = (windows * (glass * windowArea) + (trim * perimeterWindow));
        
        // Getting the outputs
        System.out.println("Window height = " + strHeight); // Test involved using 'i' as the input and successfully getting the catch message
        System.out.println("Window width = " + strWidth);
        System.out.println("Window area = " + windowArea);
        System.out.println("Window perimeter = " + perimeterWindow);
        System.out.println("Total Cost =  " + cost);
        
    }   catch(NumberFormatException e) {
            System.out.println("That was not a useable input!");
    /*  Is not found once the try/catch is implemented
        // Area of the window
        //windowArea = height * width;

        // Perimeter of the window
        //perimeterWindow = 2 * (height + width);
        
        // Calculation for total cost
        //cost = (windows * (glass * windowArea) + (trim * perimeterWindow));

    */
     
    }
  }
}
