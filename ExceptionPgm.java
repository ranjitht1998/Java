public class ExceptionPgm {
    public static void main(String[] args) {
        int j;
        int i=20;
        try {
            j = 18/20;
            System.out.println(i);

        }catch(ArithmeticException e) {
             System.out.println("In ArithmeticException" + e );
        } 
        catch(Exception e){
            System.out.println("In exception" + e );
        }
        System.out.println("in" + i);
    }
}
