import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mayank", 23);
        map.put("Ram", 24);
        map.put("Arun", 25);
        map.put("Rohan", 26);

        map.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
       //Entries greater than 25
        map.entrySet().stream().filter(x->x.getValue()>25).forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        //Get values separately
        map.values().stream().forEach(System.out::println);
        //Values sort
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
