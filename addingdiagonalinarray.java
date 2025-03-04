public class addingdiagonalinarray {
    public static void main (String [] args ){
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int n = a.length;
        for ( int i = 0 ; i < n ; i++){
            sum = a[i][i];
            if (i != n -1-i){
            sum += a[i][n-1-i];
            }
        }
        System.out.print(sum);

    }
    
}
