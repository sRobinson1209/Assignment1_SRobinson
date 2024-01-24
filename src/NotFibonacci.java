import java.util.Scanner;
public class NotFibonacci {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the number of elements in the sequence
        System.out.print("Enter the number of elements in the sequence: ");
        int sequenceLength = scanner.nextInt();
        // Generate and print the sequence based on user input
        generateNumberSequence(sequenceLength);
        scanner.close();
    }
    public static void generateNumberSequence(int n) {
        //initialize the first and second numbers in the sequence
        int first = 0; //O(1)
        int second = 1;//O(1)
        //iterate through the loop up to the target value n
        for (int i = 1; i <= n; i++) { //O(n)
            System.out.println(first + ",");
            int next = (first * 3) + (second * 2); //O(1)
            //update the elements to get them ready for the next interation
            first = second;
            second = next;
        }
    }
}

