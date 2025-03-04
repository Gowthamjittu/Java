public class multiplelevelinheritance {
    public static void main (String args []){
        ipod a = new ipod();
        a.keyboard();
        a.touch();
        a.song();

    } 
}
class laptop {
    void keyboard(){
        System.out.println("manual keybord");
    }
}
class mobile extends laptop{
    void touch(){
        System.out.println("visual keyboard");
    }
}
class ipod extends mobile{
    void song(){
        System.out.println("no keyboard");
    }
}