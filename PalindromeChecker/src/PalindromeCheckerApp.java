/*
 *@author Pradeepa
 *@version 1.0
 *
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        char[] characters = original.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {

            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
}


