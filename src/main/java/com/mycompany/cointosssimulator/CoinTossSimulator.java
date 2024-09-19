/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cointosssimulator;

/**
 * The CoinTossSimulator class contains the main method which creates an instance 
 * of the Coin class and calls the display method to start the coin toss simulation.
 * 
 */
public class CoinTossSimulator {

    /**
     * The main method where the program execution starts.
     * It creates a Coin object and initiates the coin toss simulation.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.display();
    }
}
