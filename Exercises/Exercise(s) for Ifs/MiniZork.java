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
 * Requires 3 locations & 2 choices per location
 */
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house, near a pool.");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        // Question about the three locations
        System.out.println("Go to the house, the pool, or open the mailbox? ");
        
        // Asking for the first action
        String action = userInput.nextLine();
        // Start
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            // 1st action within first location
            action = userInput.nextLine();
            // 1st choice after 'looking'
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();
                // 1st choice after 'looking inside'
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                // 2nd choice after 'looking inside'
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            // 2nd choice after 'looking'
            } else if (action.equals("stick your hand in")) { 
                System.out.println("You stick your hand in.");
                System.out.println("There is some mail.");
                System.out.println("Grab it or leave it? ");
                action = userInput.nextLine();
                // 1st choice after 'sticking my hand in'
                if (action.equals("grab it")) {
                    System.out.println("Suprise! You got bills...");
                } else if (action.equals("leave it")) {
                    System.out.println("Hopefully it isn't important..");
                }       
         }
        // 2nd location
        } else if (action.equals("go to the house")) { 
            System.out.println("You go to the house.");
            System.out.println("It seems lovely inside with all kinds of nice furniture.");
            System.out.println("Sit on the couch facing the balcony or the couch by the firepit?");
            // First action within the second location
            action = userInput.nextLine();
            // First choice within second location
            if (action.equals("Sit by the balcony")) {
                System.out.println("This view is beautiful!");
            // Second choice within the second location
            } else if (action.equals("Sit by the fire")) {
                System.out.print("So toasty!!");
            }
        // 3rd location
        } else if (action.equals("go to the pool")) {
            System.out.println("You go to the pool.");
            System.out.println("It seems hot outside so you might go for a swim.");
            System.out.println("Dive into the pool or stay and tan?");
            action = userInput.nextLine();
            // First choice within the third location
            if (action.equals("Dive in")) {
                System.out.println("Cannonball!!");
            } else if (action.equals("Get a tan")) {
                System.out.println("Time for a tan.");
            }
        }
    }
}