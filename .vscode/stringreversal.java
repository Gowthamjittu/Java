public class stringreversal {
    public static void main(String[] args) {
        String a = "123456";
        String b = "";
        char c ;
        for (int i = 0 ; i < a.length() ; i++){
            c = a.charAt(i);
            b = c+b;
            
        }
        System.out.print(b);
        
    }
}