public class palindrom {
    public static void main (String [] args){
        int a = 123;
        int b = 0;
        int c = 0;

        while (a>0){
            b = a % 10 ;
            c = (c * 10) + b;
            a = a / 10;
            
        }
        if (c != a){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }

    }
    
}