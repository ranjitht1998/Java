import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ram","Ragul");

        String sn = name.stream().filter(i-> i=="Ram");
    }
}
