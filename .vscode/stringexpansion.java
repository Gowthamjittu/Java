import java.util.Scanner;
public class stringexpansion {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter : ");
        String a = b.nextLine();
        String[] words = a.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}