/*
 * 2.Write a program using do while loop . Assume you are accessing Stamford email,
 *   and password must be combination of word and numbers ex: Lanka2024,
 *   if the user input the wrong password, more than 3 times, email account must be blocked.
 *   If the user gives the correct password, display message you can access your account.
*/

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // Create a Scanner object named input
    String password = "LANKA2024"; // Set the correct password as "LANKA2024
    Boolean accBlock = false; // Create vatiable to check if the password is correct as boolean
    String inputpass; // Create a variable to store the user input password as a string
    int attemps = 1; // Create a variable to store the attemps as an integer and set to 1

    System.out.println("WELCOME TO THE STAMFORD EMAIL");

    do {
      System.out.print("ENTER YOUR PASSWORD : ");
      inputpass = input.nextLine(); // Read user input password and store in inputpass
      if (inputpass.equals(password)) { // Check if the input password is correct
        System.out.println("PASSWORD ACCEPTED, YOU NOW HAVE ACCESS TO YOUR EMAIL.");
        accBlock = false; // Set isPass to true for terminatet the loop
        break;

      } else if (attemps >= 3) { // Check if the attemps is greater than or equal to 3 to block the account
        accBlock = true; // Set isPass to true for terminatet the loop
        break;

      } else { // If the input not correct, display the message and increment the attemps
        attemps++;
        System.out.println("INCORRECT PASSWORD, PLEASE TRY AGAIN ATTEMP " + attemps);
      }

    } while (!accBlock); // Loop until isPass is true

    if (accBlock) { // Check if the account is blocked}
      System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED, PLEASE CONTACT THE ADMINISTRATOR.");
    }

    input.close(); // Close the Scanner object
  }
}
