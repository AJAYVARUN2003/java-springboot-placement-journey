import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(101, "Ajay");
        names.put(102, "Ravi");
        names.put(103, "kumar");

        // Remove entry with key 102
        names.remove(102);

        // Try to get value for key 102 (will be null since removed)
        System.out.println(names.get(102));

        // Print entire map
        System.out.println(names);

        // Check if key 103 exists
        System.out.println(names.containsKey(103));

        // Check if key 102 exists
        System.out.println(names.containsKey(102));

        // Check if key 101 exists
        System.out.println(names.containsKey(101));

        // Check if value "kumar" exists (case-sensitive)
        System.out.println(names.containsValue("kumar"));
    }
}

