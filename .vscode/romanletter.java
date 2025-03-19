import java.util.Scanner;
public class romanletter {
    public int romanToInt(String s) {
      int total=0;
      int prevVal=0;
        for(int i=s.length()-1;i>=0;i--){
            int curVal=getValue(s.charAt(i));
            if(curVal<prevVal)
            total-=curVal;
            else
            total+=curVal;
            prevVal=curVal;
        }
        return total;
        }
 public int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }   
    public static void main(String[] args) {
                romanletter x = new romanletter();
                System.out.print("Enter the romen number = ");
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                System.out.print(x.romanToInt(s));
                
            } 
}
