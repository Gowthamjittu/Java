import java.util.*;
public class array5 {
    public static void main (String [] args){
        int a[] ={8,7,5,4,5,7,8,7,8,9};
        int temp[] = new int [a.length];
        Arrays.sort(a);
        int j = 0;
        for ( int i = 0 ; i < a.length-1 ; i++){
            if(a[i] != a[i+1]){
                temp [j++] = a[i];
            }
        }
                temp [j] = a[a.length-1];
                for(int i = 0 ; i <= j ; i++){
                    System.out.print(temp[i] + ",");      
          }
    }
}