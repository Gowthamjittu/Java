public class daimondpattern {
    public static void main (String [] args){
        for (int i = 0; i<=4; i++) {
            for (int j = 0; j<=4; j++) {
                if(i+j == 2 || i*j == 3 || i+j == 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();

        }
    }
    
}