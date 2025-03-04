import java.util.*;
public class assesment1q1 {
    public static void main (String [] args){
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;
        for (int i = 0 ; i <= n-2 ; i++){
            for (int j = i+1 ; j <= n-2 ; j++){
                for (int k = j ; k <= j-2 ; k++){
                    if (j > i){
                        System.out.print(a[j] + "is third max number");
                    }
                }
            }
            System.out.println();
        }
    }  
}
