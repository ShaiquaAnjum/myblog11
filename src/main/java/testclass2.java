import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testclass2 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("shyqa","aman","faizaan","mohit");
        List<String> allData = data.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(allData);
    }
}
