/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;
import java.util.Scanner;
/**
 *
 * @author Yonathan
 */
public class BestAdderEver {
  public static void main(String[] args) {
    Scanner myReader = new Scanner(System.in);
    
    // Creating the variables
    double num1, num3;
    int num2;
    double summedUp;
    
    // Asking for each of the numbers 
    System.out.println("What are the numbers? ");
    num1 = myReader.nextDouble();
    num2 = myReader.nextInt();
    num3 = myReader.nextDouble();
    summedUp = num1+num2+num3;
    
    // Receive the output
    System.out.println(num1+" + "+num2+" + "+num3+" = "+summedUp);

    }
}
