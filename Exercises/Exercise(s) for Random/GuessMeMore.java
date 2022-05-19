/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;
import java.util.*;
/**
 *
 * @author Yonathan
 */
public class GuessMeMore {
    public static void main(String[] args){
    // Reader
    Scanner inputReader = new Scanner(System.in);
    Random randomizer = new Random();
    
    // Make int variable with a range of -100 to 100
    int intVar = randomizer.nextInt(100 + 100) - 100;
    int userNumb;
    
    System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
    
    // Ask user to pick a number    
    System.out.println("Your guess: ");
    userNumb = Integer.parseInt(inputReader.nextLine());
    
    // Print number
    System.out.println();
    // IF choice == intVar, print "Wow, nice guess! That was it!"
    if (intVar == userNumb) {
        System.out.println("Wow, nice guess! That was it!");
    } else if (userNumb < intVar) { // IF choice < intVar, print "Ha, nice try - too low! I choose #."
        System.out.println("Ha, nice try - too low! Try again!");
        System.out.println("Your guess: ");
        userNumb = Integer.parseInt(inputReader.nextLine());
    } else if (userNumb > intVar) { // IF choice > intVar, print "Too bad, way too high. I choose #."
        System.out.println("Too bad, way too high. Try again!");
        System.out.println("Your guess: ");
        userNumb = Integer.parseInt(inputReader.nextLine());
    }
  }
}
