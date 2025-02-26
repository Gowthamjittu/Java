public class countnuminarray{
    public static void main (String [] args){
        int [][] a = {{5,2,3},{4,5,5},{7,8,9}};
        int n = a.length;
        int sum = 0 ;
        for (int i = 0 ; i < n ; i++){
            if (a[i][i] == 5){
                sum += 1;
                System.out.print(sum);
            }
        }
        System.out.println();
    }
}