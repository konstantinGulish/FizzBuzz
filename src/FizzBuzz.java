// This is a basic FizzBuzz program that prints out a list of integer adding pre-defined words to some of them
// and testing for unique conditions


public class FizzBuzz {

    public static void main(String[] args) {

        printNumberList();
    }

    // The method does not accept any arguments, and returns a string representation of the list
    private static void printNumberList() {
        for (int i=1; i <=100; i++){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("Fizz " + " Buzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
