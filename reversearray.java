public class reversearray {
    public static void main (String []args){
        int [] a = {2, 5, 7, 9, 20};
        for (int i = 0 ; i < a.length / 2 ; i++){
            int temp = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]= temp;
        }
        for (int i = 0 ; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}