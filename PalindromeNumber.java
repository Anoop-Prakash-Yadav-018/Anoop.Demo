package Recursion;

public class PalindromeNumber {
    static boolean isPalindrome(int num, int arg, int reverse) {
        // Base case
        if(num == 0){
            return arg == reverse;
        }
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        return isPalindrome(num/10, arg, reverse); // RR- num / 10

    }

    //static int rev;
    static int palindrome(int num){
        return palindrome(num, rev:0);
    }

    // Helper Function
    static int palindrome(int num, int rev){
        //base case
        if(num == 0){
            return rev;
        }
    }
    public static void main(String[] args) {
        boolean result = isPalindrome(151, 151, 0);
        System.out.println(result ? "Palindrome" : "Not Palindrome");
    }
}
