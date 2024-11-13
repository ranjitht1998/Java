class A{
    public void printA(){
        System.out.println("in A");
    }
    class B{
        public void printB(){
            System.out.println("in B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj =new A();
        obj.printA();

        A.B obj2 = obj.new B();
        obj2.printB();

    }
}
