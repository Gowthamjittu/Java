import java.util.Scanner;
public class pallindromeass {
        public boolean isPalindrome(int x) {
           if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int a = 0;
            while (x > a) {
                a = a * 10 + x % 10;
                x /= 10;
            }
            return x == a || x == a / 10;
        }
        public static void main(String[] args) {
            pallindromeass b = new pallindromeass();
            System.out.print("Enter the num : ");
            Scanner c = new Scanner(System.in);
            int x = c.nextInt();  
            System.out.println(b.isPalindrome(x));
        }
    }