/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Yonathan
 */
public class GuessMe {
    public static void main(String[] args){
    // Reader
    Scanner inputReader = new Scanner(System.in);
    
    // Make int variable
    int intVar = 22;
    int userNumb;
    
    System.out.println("I've chosen a number. Betcha can't guess it!");
    
    // Ask user to pick a number    
    System.out.println("Your number: ");
    userNumb = Integer.parseInt(inputReader.nextLine());
    // Print number
    System.out.println();
    // IF choice == intVar, print "Wow, nice guess! That was it!"
    if (intVar == userNumb) {
        System.out.println("Wow, nice guess! That was it!");
    } else if (userNumb < intVar) { // IF choice < intVar, print "Ha, nice try - too low! I choose #."
        System.out.println("Ha, nice try - too low! I choose " + userNumb + ".");
    } else if (userNumb > intVar) { // IF choice > intVar, print "Too bad, way too high. I choose #."
        System.out.println("Too bad, way too high. I choose " + userNumb + ".");
    }
  }
}
