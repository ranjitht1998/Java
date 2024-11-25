interface TestFuncntions {
    String name = "MohammadIsmail";
    int area();
}

class A implements TestFuncntions{
    @Override
    public int area() {
        return 0;
    }
}

public class Interface {
    public static void main(String[] args) {
        String asc = TestFuncntions.name;
        A obj = new A();
        obj.area();
    }
}
