import java.util.Scanner;
public class methodoverloading {
     static Scanner n = new Scanner(System.in);
    static void jittu(int a , int d){   
        System.out.println(a+d);
    }
    static void jittu(double c , int d){
        System.out.println(c-d);

    }
    static void jittu(int a , double b){
        System.out.println(a*b);

    }
    public static void main (String [] args){
        System.out.print(" Enter the a value : "); 
        int a = n.nextInt();
        System.out.print(" Enter the b value : "); 
        double b = n.nextDouble();
        System.out.print(" Enter the c value : "); 
        double c = n.nextDouble();
        System.out.print(" Enter the d value : "); 
        int d = n.nextInt();
        jittu(a , d);
        jittu(c , d);
        jittu (a , b);
    }
    
}
