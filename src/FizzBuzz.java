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
        Random rnd = new Random();
        for (int i=1; i <=100; i++){
            if (i==1)  {
                first = 1 + rnd.nextInt (100); // generates the first random number for the list
                System.out.println(first);
            }
            if (i==100)  {
                last = 10+ rnd.nextInt (100); // generates the last random number for the list
                System.out.println(last);
            }
            else if (i%3 == 0 && i%5 == 0) {
                System.out.println("Fizz " + " Buzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else if (i%7 == 0) {
                System.out.println (i + " - multiple of 7"); // prints next to the numbers
            }
            else {
                System.out.println(i);
            }
        }
        if (first == last){
            System.out.println ("Shazam!!"); // prints if the first and last random numbers are the same
        }
        if (Math.abs(last-first) < 10) {
            System.out.println ("This won't take long."); // prints if the first and last random numbers are less than 10 apart
        }
    }
}
