import java.util.Scanner;
public class harshadnumber{
    public static void main (String [] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter : 7");
        int b = a.nextInt();
        b += b + 2;
        System.out.println(b);
    }
}