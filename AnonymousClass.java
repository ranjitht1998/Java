class A{
    public void show(){
        System.out.println("In A");
    }
}

public class AnonymousClass {
    public static void main(String args[]){
        A obj = new A(){
            public void show()
            {
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}
