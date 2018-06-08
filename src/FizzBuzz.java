// This is a basic FizzBuzz program that prints out a list of integer adding pre-defined words to some of them
// and testing for unique conditions

import java.util.Random;
public class FizzBuzz {

    public static void main(String[] args) {

        printNumberList();
    }

    // The method does not accept any arguments, and prints the list
    private static void printNumberList() {
        int first = 1;
        int last = 100;
        int counter = 0; //to keep track of the number of times (Rock,Paper,Scissors, Spock) is called
        Random rnd = new Random();
        String[] gameItems = {"Rock", "Paper", "Scissors", "Spock"}; //used for bonus implementation

        // Create the list
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                first = 1 + rnd.nextInt(100); // generates the first random number for the list
                if (first % 3 == 0 && first % 5 == 0) {
                    System.out.println("Fizz " + " Buzz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }
                else if (first % 3 == 0) {
                    System.out.println("Fizz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }
                else if (first % 5 == 0) {
                    System.out.println("Buzz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }

                //handles even numbers greater than 10 for bonus implementation
                else if (first % 2 == 0 && first > 10) {
                    System.out.println(first + " - " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }
                else if (first % 7 == 0) {
                    System.out.println(first + " - multiple of 7"); // prints next to the numbers
                }
                else {
                    System.out.println(first);
                }
            }
            if (i == 100) {
                last = 10 + rnd.nextInt(100); // generates the last random number for the list
                if (last % 3 == 0 && last % 5 == 0) {
                    System.out.println("Fizz " + " Buzz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                } else if (last % 3 == 0) {
                    System.out.println("Fizz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                } else if (last % 5 == 0) {
                    System.out.println("Buzz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }

                //handles even numbers greater than 10 for bonus implementation
                else if (last % 2 == 0 && last > 10) {
                    System.out.println(last + " - " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                } else if (last % 7 == 0) {
                    System.out.println(last + " - multiple of 7"); // prints next to the numbers
                } else {
                    System.out.println(last);
                }
            }

                // bonus implementation adds the game item and replaces numbers where the words are already written
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizz " + " Buzz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }

                //handles even numbers greater than 10 for bonus implementation
                else if (i % 2 == 0 && i > 10) {
                    System.out.println(i + " - " + gameItems[counter]);
                    counter++;
                    if (counter >= gameItems.length) counter = 0; //resets the counter to restart the process
                }
                else if (i % 7 == 0) {
                    System.out.println(i + " - multiple of 7"); // prints next to the numbers
                }
                else {
                    System.out.println(i);
                }

            if (first == last) {
                System.out.println("Shazam!!"); // prints if the first and last random numbers are the same
            }
            if (Math.abs(last - first) < 10) {
                System.out.println("This won't take long."); // prints if the first and last random numbers are less than 10 apart
            }
        }
    }
}
