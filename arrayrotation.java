import java.util.Arrays.*;
public class arrayrotation{
    public static void main(String[]args){
        int []a={1,2,3,4,5};
        int d=2;
        int n=a.length;
        for(int i=0;i<d;i++){
            int b=a[0];
            for (int j=n ;j>i+1;j--){
                a[j]=a[j-1];
            }
            a[i+1]=b;
        }
    
              for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
        }
    }
}