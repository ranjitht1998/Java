import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Coll {
    public static void main(String[] args) {
        // List<Integer> abc = new ArrayList<Integer>();
        // abc.add(1);
        // abc.add(2);
        // abc.add(3);
        // abc.add(4);
      
        // System.out.println(abc);

        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(12);
        // nums.add(23);
        // nums.add(42);
        // nums.add(12);
        // nums.add(17);
        // System.out.println(nums);
        // Iterator<Integer> values = nums.iterator();

       
        // while(values.hasNext())
        //     System.out.println(values.next());

        Map<String , Integer> students = new HashMap<String,Integer>();
        students.put("ram", 22);
        students.put("dp", 12);
        students.put("fayeez", 45);

        System.out.println(students.values());
        // System.out.println(students);
    }
}
