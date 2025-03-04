public class addbignum {
    public static void main( String[] args ) {
        String a = "123456789" ;
        String b = "987654321" ;
        int i = a.length() - 1 ;
        int j = b.length() - 1 ;
        int s , c = 0 , d1 , d2 , d3 ;
        StringBuilder sum = new StringBuilder() ;
        StringBuilder e = new StringBuilder() ;
        while(i >= 0 && j >= 0) {
           d1 = a.charAt(i) - '0' ;
           d2 = b.charAt(j) - '0' ;
           d3 = d1 + d2 + c ;
           s = d3 % 10 ;
           c = d3 / 10 ;
           if (i != 0) {
            sum.append(s) ;
           }
           else {
            e.append(d3) ;
            e.reverse();
            sum.append(e) ;
           }
           i-- ;
           j-- ;
        }
        System.out.println(sum.reverse());
    }
}