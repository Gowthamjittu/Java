import java.util.*;
public class reversearray1{
    public static void main( String [] args){
        Integer [] a = {1, 2, 3, 4, 5};
        Collections.reverse(Arrays.asList(a));
        System.out.print(Arrays.asList(a));

    }
    
}