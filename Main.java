public class Main{
    public static void main (String []args){
      int [] a = {1, 5, 6, 9, 3, 7};
      int temp = a[a.length-1];
      for (int i = a.length-1 ; i >= 0 ; i--){
        a[i+1] = a[i];

      }
      for (int i = 0 ; i < a.length ; i++){
        System.out.print(a[i] + ",");
      }

    }

}