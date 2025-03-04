import java.util.Scanner;
public class spaceremover {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter : ");
        String a = b.nextLine();
        String[] c = a.trim().split("\\s+");
        StringBuilder d = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            d.append(c[i]);
            if (i > 0) {
                d.append(" ");
            }
        }
        System.out.println(d.toString());
    }
}