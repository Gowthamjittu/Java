public class areainfunction {
    public static void main (String args []){
        jittu b = new jittu(8 , 9);
        b.area();

    }
    
}
class yolo{
    int i , j ;
    yolo(int i , int j){
        this.i = i;
        this.j =j ;

    }
    void area(){
        System.out.print("Area of rectangle : ");
    }
}
class jittu extends yolo{
    jittu(int i , int j ){
        super(i , j);

    }
    void area(){
        int k = i*j;
        super.area();
        System.out.println(k);
    }

}
