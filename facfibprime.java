import java.util.Scanner;
public class facfibprime{
    static Scanner a = new Scanner(System.in);
    static void jittu(int b){
        for (int i = b-1 ; i >= 1 ; i--){
            b = b*i;
            
        }
        System.out.print(b);
    }
    public static void main (String args []){
        System.out.print("Enter the num : ");
        int b = a.nextInt();
        jittu(b);
    }
}