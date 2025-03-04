import java.util.Scanner;
public class stringpalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindromeUsingString(input)) {
            System.out.println("Palindrome (Using String methods)");
        } else {
            System.out.println("Not a Palindrome (Using String methods)");
        }
        if (isPalindromeUsingStringBuilder(input)) {
            System.out.println("Palindrome (Using StringBuilder methods)");
        } else {
            System.out.println("Not a Palindrome (Using StringBuilder methods)");
        }
        if (isPalindromeUsingStringBuffer(input)) {
            System.out.println("Palindrome (Using StringBuffer methods)");
        } else {
            System.out.println("Not a Palindrome (Using StringBuffer methods)");
        }
        if (isPalindromeWithoutBuiltInMethods(input)) {
            System.out.println("Palindrome (Without built-in methods)");
        } else {
            System.out.println("Not a Palindrome (Without built-in methods)");
        }
        scanner.close();
    }
    public static boolean isPalindromeUsingString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static boolean isPalindromeUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
    public static boolean isPalindromeUsingStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
    public static boolean isPalindromeWithoutBuiltInMethods(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}