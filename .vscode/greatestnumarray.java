import java.util.Scanner;
public class greatestnumarray {
    public static void main (String [] args){
        Scanner a= new Scanner(System.in);
        int b[][]= new int[2][5];
        System.out.print("Enter the array : ");
        for(int i=0; i<b.length; i++){
            int c= b[i][0];
            for(int j=0; j<b[i].length; j++){
                b[i][j]= a.nextInt();
                if(c<b[i][j]){
                    c= b[i][j];
                }
            }
            System.out.println("Maximum number : "+ c);
            System.out.println();
        }        
    }   
}