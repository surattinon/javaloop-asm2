/*
 * 1. Write a Java program to compute the integer powers of 2, from 0 to 10.
*/

public class Q1 {
  public static void main(String[] args) {
    int pownums = 0; // Define variable to store the power number as integer and set to 0

    while (pownums < 10) { // Loop until the power number is less than 10
      int powresult = (int) Math.pow(2, pownums); // Calculate the power of 2
      System.out.println(2 + " to the " + pownums + " power is " + powresult); // Print the result
      pownums++; // Increment the power number
    }
  }
}
