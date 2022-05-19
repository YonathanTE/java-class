/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner; 
/**
 *
 * @author Yonathan
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        // Use the statement, "Let's play MAD LIBS!!"
        System.out.println("Let's play MAD LIBS!!");
                
        // Set variables based on type
        String noun1, noun2, adj1, adj2, pNoun1, pNoun2, pNoun3, presentVerb, pastVerb, strNumb;
        int numb1;

        // Ask for noun
        System.out.println("I need a noun: ");
        noun1 = inputReader.nextLine();
        
        // Ask for an adjective
        System.out.println("Now an adjective: ");
        adj1 = inputReader.nextLine();
        
        // Ask for another noun
        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();
        
        // Ask for a number and after receiving it, convert the number into a string 
        System.out.println("And a number: ");
        strNumb = inputReader.nextLine();
        numb1 = Integer.parseInt(strNumb);
        
        // Ask for another adjective
        System.out.println("Another adjective: ");
        adj2 = inputReader.nextLine();
        
        // Ask for a plural noun
        System.out.println("A plural noun: ");
        pNoun1 = inputReader.nextLine();
        
        // Ask for a plural noun
        System.out.println("Another one: ");
        pNoun2 = inputReader.nextLine();
        
        // Ask for a plural noun
        System.out.println("One more: ");
        pNoun3 = inputReader.nextLine();
        
        // Ask for a verb present tense
        System.out.println("A verb (infinitive form): ");
        presentVerb = inputReader.nextLine();
        
        // Ask for a same verb but past tense
        System.out.println("Same verb (past participle): ");
        pastVerb = inputReader.nextLine();
        
        // Write the '*** NOW LETS GET MAD (libs) ***'
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        // Put the variables together for 1 long sentence
        // Test worked up to 'numb1' CONTINUE UPDATING *
        System.out.print(noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " +
                numb1 + "-year mission: to explore strange " + adj2 + " \n"+ pNoun1 + ", to seek out " + adj2 + " " + pNoun2 + " and " + adj2 + " " + pNoun3 + ", to boldly " +
                presentVerb + " where no one has " + pastVerb + " before.");
    }
}
