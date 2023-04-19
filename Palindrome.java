import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        String reverseString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }

        if (inputString.equals(reverseString)) {
            System.out.println(inputString + " is a palindrome");
        } else {
            System.out.println(inputString + " is not a palindrome");
        }
    }
}
