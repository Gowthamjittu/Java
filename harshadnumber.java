import java.util.Scanner;
public class harshadnumber{
    public static void main (String [] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = a.nextInt();
        int temp = 0;
        int sum = 0;
        temp = n;
        while(temp>0){
            int d = temp % 10;
            sum += d;
        }
    }
}