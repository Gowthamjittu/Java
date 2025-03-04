public class singleinheritance {
    public static void main (String args []){
        city a = new city();
        a.tamilnadu();
        a.salem();
    }  
}
class state{
    void tamilnadu(){
    System.out.println("tamil");
    }
}
class city extends state{
    void salem(){
        System.out.println("mango");
    }
}