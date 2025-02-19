public class reversearray{
    public static void main (String []args){
        int[] a = {3, 4, 7, 2, 9};
        for (int i  = 0 ; i < a.length / 2 ; i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;

        }
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
}