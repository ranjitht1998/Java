class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("Construtor called");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}


public class Encapsulation {
    public static void main(String args[]){
        Human sricharan= new Human();
        sricharan.setAge(10);
        System.out.println(sricharan.getAge());
    }
}
