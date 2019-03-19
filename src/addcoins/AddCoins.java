/*
 * Michelle Wojdak
 * To add coins and determine dollar value
 * 19/03/2019
 */
package addcoins;

import java.util.Scanner;

public class AddCoins {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int quarters, dimes, nickles, pennies;
        //ask the user for the amount of quarters, dimes, nickles, and pennies they have
        Scanner input = new Scanner(System.in);   
        System.out.println("Enter your total coins:");
        System.out.print("Quarters: ");
        quarters = input.nextInt();
        System.out.print("Dimes: ");
        dimes = input.nextInt();
        System.out.print("Nickles: ");
        nickles = input.nextInt();
        System.out.print("Pennies: ");
        pennies = input.nextInt();
        System.out.println("Total: $" + getDollarAmount(quarters, dimes, nickles, pennies));   
    }
    /*
    * @param quarters: Number of 0.25 cent coins
    * @param dimes: Number of 0.10 cent coins
    * @param nickles: Number of 0.05 cent coins
    * @return value: The total dollar amount of coins combined
    */
    
    public static double getDollarAmount(int quarters, int dimes, int nickles, int pennies) {
        double q, d, n, p, total;
        //Take number of coins and transform to monetary value
        q = quarters * 0.25;
        d = dimes * 0.10;
        n = nickles * 0.05;
        p = pennies * 0.01;
        //add total of seperate coins together
        total = q + d + n + p;
        return total;
        
    }    
    
}
