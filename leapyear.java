import java.util.Scanner;
public class leapyear {
    public static void main (String []args){
        Scanner a = new Scanner(System.in); 
        System.out.print("Enter the year : " );
        int b = a.nextInt();
        if ((b % 4 ==0) && (b % 100 != 0) || (b % 400 == 0)){
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
        a.close();
     
    }
}
