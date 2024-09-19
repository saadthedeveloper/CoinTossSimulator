/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.cointosssimulator;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * The Coin class simulates the tossing of a coin. It tracks the current side up
 * as well as the number of times "Heads" and "Tails" appear.
 */
public class Coin {
    private String sideUp;
    int tails;
    int heads;
    
    /**
     * Constructor for the Coin class.
     * Initializes the coin with "Tails" facing up and resets the counters for "Heads" and "Tails".
     */
    public Coin() {
        sideUp = "Tails";
        tails = 0;
        heads = 0;
    }

    /**
     * Simulates the coin toss by randomly selecting either "Tails" or "Heads".
     */
    public void toss() {
        Random rand = new Random();
        int randomInt = rand.nextInt(2);
        
        if (randomInt == 0) {
            sideUp = "Tails";
        } else {
            sideUp = "Heads";
        }           
    }

    /**
     * Returns the current side of the coin that is facing up.
     * 
     * @return A string representing the side of the coin that is facing up ("Tails" or "Heads").
     */
    public String getSideUp() {
        return sideUp;
    }

    /**
     * Prompts the user to enter the number of rounds, simulates coin tosses for the given rounds, 
     * and displays the results. It also counts the number of "Heads" and "Tails".
     */
    public void display() {
        int rounds;
        
        rounds = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rounds"));
        
        while (rounds > 0) {
            toss();
            JOptionPane.showMessageDialog(null, getSideUp());
            if (getSideUp().equalsIgnoreCase("tails")) {
                tails++;
            } else {
                heads++;
            }
            rounds--;
        }
        
        JOptionPane.showMessageDialog(null, "Total tails: " + tails + "\n" + "Total heads: " + heads);
    }
}
