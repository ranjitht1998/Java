import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class Compar {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        // Comparator<Integer> com = new Comparator<Integer>(){
        //     public int compare(Integer i , Integer j){
        //         if(i%10 > j% 10){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };

        // nums.add(46);
        // nums.add(22);
        // nums.add(61);
        // nums.add(69);

        // Collections.sort(nums,com);
        // System.out.println(nums);

        Comparator<Student> com = (Student i , Student j) -> {
                if(i.age > j.age) {
                    return 1;
                }else{
                    return -1;
                }
        };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(30, "ram"));
        stud.add(new Student(22, "dp"));
        stud.add(new Student(44, "fayeez"));

        Collections.sort(stud,com);

        for(Student s : stud){
            System.out.println(s);
        }
    }
}
