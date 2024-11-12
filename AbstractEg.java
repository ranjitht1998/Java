
abstract class A{
    public abstract void print();

    public void printAclass(){
        System.out.println("In A");
    }
}

class B extends A {
    public void print(){
        System.out.println("In B");
    }
}

public class AbstractEg {
    public static void main(String args[]){
        A obj = new B();
        obj.print();
    }
}
