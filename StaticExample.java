
class Mobile{
    String name = "asd";
    int cost;
    static String maker;


    Mobile(){   
        
    }
    public void print(){
        System.out.println(maker + ' ' + name +' ' + cost);
    }
}

public class StaticExample {
    public static void main(String args[]){
        Mobile moto = new Mobile();
        moto.name = "ram";
        moto.cost= 200;
        Mobile.maker = "Foxconn";
        moto.print();
        Mobile samsung = new Mobile();
        samsung.print();

    }
}
