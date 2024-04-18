/*
 * 4.Ask for the name of somebody the user wants to invite to the party. After this, display the message
 *   “[name] have now been invited” and add 1 to the count. Then ask if they want to invite somebody else.
 *   Keep repeating this until they no longer want to invite anyone else to the party and then
 *   display how many people they have coming to the party.
*/

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object
    int count = 1; // Create a count variable to store the number of people coming to the party
    boolean invite = true; // Create a boolean variable to store the state of the invitation

    while (invite) { // Use infinite loop to invite people to the party
      System.out.println("Enter the name of the person you want to invite to party: ");
      String person = input.nextLine(); // Recieve the name of the person and store it in person
      System.out.println(person + " has now been invited.");

      System.out.println("Do you want to invite somebody else (yes/no): ");
      while (true) { // Use infinite loop to check the user input answer
        String answer = input.nextLine(); // Receive the input and store it in answer
        if (answer.equals("yes")) { // If recieved "yes"
          count++; // Increase number of people coming to the party
          break; // Break this loop and continue the main loop
        } else if (answer.equals("no")) { // If recieved "no"
          invite = false; // Set boolean invite to false
          break; // Break this loop
        } else { // If recieved invalid input
          System.out.println("Invalid Input, Please enter \"yes\" or \"no\": ");
        }
      }
    }
    System.out.println("You have " + count + " people coming to the party.");
    input.close(); // Close the scanner object
  }
}
