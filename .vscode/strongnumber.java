import java.util.Scanner;
public class strongnumber {
    public static void main (String args []){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = a.nextInt();
        int t = 0;
        int s = 0;
        t = n;
        while(t>0){
            int d = t % 10;
            int f = 1;
            for (int i = d ; i >= 1 ; i--){
                f = f*i;
            }
            s = s + f;
            t = t / 10;
        }
        if (s == n){
            System.out.print(n + " is strong number");
        }
        else {
            System.out.print(n + " is not a strong number");
        }
    }    
}
