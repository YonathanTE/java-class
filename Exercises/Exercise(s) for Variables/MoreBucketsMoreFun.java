/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Yonathan
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {

        // Declare variables
        int butterflies, beetles, bugs;

        // Assign values for two of the variables
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--; // Decrement operator is used to subtract the bug eaten
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        // The number of bugs did not change because these are two separate variables used to get each value
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a second!");
        System.out.println(".. maybe my computer can't do math, after all!");
    }
}
