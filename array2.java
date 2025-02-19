public class array2 {
    public static void main(String [] args){
        int[] a = {5, 7, 2, 11};
        int temp = a[a.length-1];
        for(int i = a.length-2 ; i >= 0 ; i-- ){
            a[i] = a[i+1];
        }
        a[0] = temp;
        for (int i = 0 ; i < a.length; i++){
            System.out.print(a[i]);

        }
    }
    
}
