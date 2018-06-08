/// This is a basic FizzBuzz program that prints out a list of integer adding pre-defined words to some of them
// and testing for unique conditions

import java.util.ArrayList;

public class FizzBuzzBonus extends FizzBuzz {

    public static void main(String[] args) {

        ArrayList <String> output = new ArrayList<String>();
        storeNumberList(output);
        System.out.println(printList(output));
    }

}