import java.util.Arrays;

public class array6 {
    public static void main ( String [] aargs){
        int a[] ={5, 6, 12, 7, 8, 1, 4, -3};
        for (int i = 0 ; i < a.length ; i++){
            for ( int j = i+1 ; j < a.length ; j++){
                if (a[i] + a[j] == 9){
                    System.out.print("(" + a[i]+","+a[j] + ")" );

                }
            }
        }
        

    }
    
}
