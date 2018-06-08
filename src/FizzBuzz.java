/// This is a basic FizzBuzz program that prints out a list of integer adding pre-defined words to some of them
// and testing for unique conditions

import java.util.ArrayList;
import java.util.Random;
public class FizzBuzz {

    public static void main(String[] args) {

        ArrayList <String> output = new ArrayList<String>();
        storeNumberList(output);
        System.out.println(printList(output));
    }

    // The method does not accept any arguments, and prints the list
    public static void storeNumberList(ArrayList<String> output) {
        Random rnd = new Random ();
        String [] gameItems = {"Rock", "Paper", "Scissors", "Spock"};
        int counter = 0;
        int first = 1 + rnd.nextInt(100);
            if (first%3 == 0 && first%5 == 0) {
                counter = FizzBuzz(output, gameItems, counter, first);
            }
            else if (first%3 == 0) {
                counter = Fizz(output, gameItems, counter, first);
            }
            else if (first%5 == 0) {
                if (first > 10 && first % 2 == 0) {
                    counter = AddGameItemStandard(output, "Buzz " + gameItems[counter], counter);}
                else output.add("Buzz");

            }
            else if (first%7 == 0) {
                multipleOfSeven(output, gameItems, counter, first, first);
            }
            else if (first > 10 && first % 2 == 0) {
                counter = AddGameItemStandard(output, String.valueOf(first) + " - " + gameItems[counter], counter);
            }
            else {
                output.add(String.valueOf(first));
            }

        for (int i=2; i <100; i++){
            if (i%3 == 0 && i%5 == 0) {
                counter = FizzBuzz(output, gameItems, counter, i);
            }
            else if (i%3 == 0) {
                counter = Fizz(output, gameItems, counter, i);
            }
            else if (i%5 == 0) {
                if (i > 10 && i % 2 == 0) {
                    counter = AddGameItemStandard(output, "Buzz " + gameItems[counter], counter);}
                else output.add("Buzz");

            }
            else if (i%7 == 0) {
                if (i > 10 && i % 2 == 0) {
                    counter = AddGameItemStandard(output, String.valueOf(i) + " - " + gameItems[counter] + " - multiple of 7", counter);}
                else output.add (String.valueOf(i) + " - multiple of 7"); // prints next to the numbers
            }
            else if (i > 10 && i % 2 == 0) {
                counter = AddGameItemStandard(output, String.valueOf(i) + " - " + gameItems[counter], counter);
            }
            else {
                output.add(String.valueOf(i));
            }
            if (counter >= gameItems.length) counter = 0;
        }
        int last = 1 + rnd.nextInt(100);
            if (last%3 == 0 && last%5 == 0) {
                counter = FizzBuzz(output, gameItems, counter, last);
            }
            else if (last%3 == 0) {
                counter = Fizz(output, gameItems, counter, last);
            }
            else if (last%5 == 0) {
                Buzz(output, gameItems, counter, first, last);

            }
            else if (last%7 == 0) {
                multipleOfSeven(output, gameItems, counter, first, last);
            }
            else if (last > 10 && last % 2 == 0) {
                output.add(String.valueOf(last) + " - " + gameItems[counter]);
            }
            else {
                output.add(String.valueOf(last));
            }
        if (first == last){
            output.add ("Shazam!!"); // prints if the first and last random numbers are the same
        }
        if (Math.abs(last-first) < 10) {
            output.add ("This won't take long."); // prints if the first and last random numbers are less than 10 apart
        }
    }

    private static int AddGameItemStandard(ArrayList<String> output, String e, int counter) {
        output.add(e);
        counter++;
        return counter;
    }

    private static void multipleOfSeven(ArrayList<String> output, String[] gameItems, int counter, int first, int last) {
        if (last > 10 && last % 2 == 0) {output.add (String.valueOf(first) + " - " + gameItems[counter] + " - multiple of 7");}
        else output.add (String.valueOf(last) + " - multiple of 7"); // prints next to the numbers
    }

    private static void Buzz(ArrayList<String> output, String[] gameItems, int counter, int first, int last) {
        if (last > 10 && first % 2 == 0) {
            counter = AddGameItemStandard(output, "Buzz " + gameItems[counter], counter);}
        else output.add("Buzz");
    }

    private static int Fizz(ArrayList<String> output, String[] gameItems, int counter, int first) {
        if (first > 10 && first % 2 == 0) {
            counter = AddGameItemStandard(output, "Fizz " + gameItems[counter], counter);}
        else output.add("Fizz");
        return counter;
    }

    private static int FizzBuzz(ArrayList<String> output, String[] gameItems, int counter, int first) {
        if (first > 10 && first % 2 == 0) {
            counter = AddGameItemStandard(output, "Fizz " + " Buzz " + gameItems[counter], counter);}
        else output.add("Fizz " + " Buzz");
        return counter;
    }

    public static String printList (ArrayList<String> output) {
        StringBuffer logBuffer = new StringBuffer();
        for (String out: output) {
            logBuffer.append(out + "\n");
        }
        return logBuffer.toString();
    }
}