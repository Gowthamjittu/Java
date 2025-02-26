public class Main{
    public static void main(String[] args){
       twoDim();
       
           }
        static void twoDim(){
        int b = 5 ;
        int[] [] a = new int [5] [5];
        int k = 1;
        for (int i = 0 ; i < b ; i++){
            for (int j = 0 ; j < b ; j++){
                a[i][j] = k++;

            }
        }
        for (int i = 0 ; i < b ; i++ , System.out.print("")){
            for (int j = 0 ; j < b ; j++ , System.out.println(" ")){
                System.out.print(a[i][j]);
            }
        }
    }

}