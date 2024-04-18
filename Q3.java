/*
 * 3.Write a Java program to use ‘loop’ and ‘break’ statements to print
 * the prime numbers from 2 to maximum number that user enters.
 */

import java.util.Scanner;

public class Q3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object
    int primeNum = 2; // Define primeNum as int and set to 2
    System.out.println("Enter maximum number:");

    // Define int maxNum to recieve the maximum number from the user
    int maxNum = input.nextInt();

    System.out.println("List of prime number from 2 to " + maxNum + " is");
    System.out.println("--*--*--*--*--*--*--*--*--*--*--*--");

    // Loop to check for prime numbers from 2 to maxNum
    while (primeNum <= maxNum) {
      boolean prime = true; // Define boolean prime and set to true at first

      // Loop the variable checker from 2 to current primeNum-1
      // to check if primeNum is prime
      for (int checker = 2; checker < primeNum; checker++) {
        if (primeNum % checker == 0) { // If primeNum is divisible by checker
          // then set prime to false and break the for loop
          prime = false;
          break;
        }
      }
      if (prime) { // after break for loop, if prime is true, then print the prime number
        System.out.print(primeNum + "\t");
      }
      primeNum++; // Increment the prime number by 1
    }
    input.close(); // Close the Scanner object
  }
}
