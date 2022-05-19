/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;
import java.util.Random;
/**
 *
 * @author Yonathan
 */
public class ALittleChaos {
    public static void main(String[] args) {
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        // Alternative
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");
        // Using the Random class for the different numbers
        /* 'What happens if you change "randomizer.Next(101)" to "randomizer.Next(51)" + 50?' 
        The random component is limited up to 50, then adds on 50 with the random component to get the output */
        System.out.print(randomizer.nextInt(51) + randomizer.nextInt(50) + ", ");
        // 'Can you include random numbers in a math statement? Yes, as proven in line 30.'
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
    
    }
}
