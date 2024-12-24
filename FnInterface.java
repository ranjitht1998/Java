
@FunctionalInterface
interface A{
    int show(int i);
}

public class FnInterface {
    public static void main(String args[]){
        A obj = i -> {
            System.out.println(i);
            return i;
        };

        obj.show(2);
    }
}
