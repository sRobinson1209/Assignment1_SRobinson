import java.util.Scanner;
public class WhereIn {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target number");
        int taregtNumber = scanner.nextInt();
        int closestPosition = findClosest(taregtNumber);

        if (closestPosition== -1){
            System.out.println("No clod=sest number in the sequence");
        }
        else{
            System.out.println("Position of the closest number is "+ closestPosition);
        }
        scanner.close();
    }

    public static int findClosest(int target){
        //initialize the first two elements
        int a = 0; //O(1)
        int b =1; //O(1)
        // Check if the target is less than or equal to the initial value, return -1 if true which will print a message.
        if (target <= a){ //O(1)
           return -1;
        }
        // Initialize the position of the current element in the sequence
        int position =2; //O(1)
        // Iterate through to find the closest number
        while (true){ //
            //calculate the next element
            int next = b *2 +a;
            //check if element is equal to the target
            if (next == target) //O(1)
            {
                return position;
            }
            //check if element is greater than the target
            else if (next > target) { //O(n)
                return position - 1;
            }
            //update the variables
            a = b;
            b = next;
            position++;
            }
        }
        }


