import java.util.Scanner;
public class CommonSubsequence {
    public static int text ( String text1,String text2 ){
        // Get the lengths of the input strings
         int a = text1.length(); //O(1)
         int b = text2.length(); // O(1)
// Create a 2D array to store the length of the longest common subsequence at each position
        int[][] dp = new int[a + 1][b + 1]; //O(1)
// Iterate through the input strings to fill the 2D array
        for (int i = 1; i <= a; i++) { //O(n)
            for (int j = 1; j <= b; j++) { //O(n)
                //If the characters at the current positions match, update the length of the subsequence
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) { //O(1)
                    dp[i][j] = dp[i - 1][j - 1] + 1; //O(1)
                    // If characters don't match, take the maximum length from the adjacent positions
                } else { //O(1)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
       // The final element in the 2D array contains the length of the longest common subsequence
        return dp[a][b];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User inputs the first string
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();
        //Input the second string
        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();
        //text method will calculate the result
        int result = text(text1, text2);

        // Display the result
        System.out.println("Length of the Longest Common Subsequence: " + result);

        scanner.close();
    }
    }

