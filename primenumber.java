import java.util.Scanner;
public class primenumber {
    public static void main (String args []){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = a.nextInt();
        for (int i = 2 ; i < n ; i++){
            int b = n%i;
            if (b == 0){
                System.out.println("it is not a prime number"); 
                break;               
            }
            else{
                
            }
            
        }
        a.close();

    }
    
}
