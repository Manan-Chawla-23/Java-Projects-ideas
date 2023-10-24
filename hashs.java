import java.util.HashMap;
import java.util.Map;
public class hashs 
{
    public static void main(String[] args) 
    {
        String input = "Hello, World!";
        int hashCode = input.hashCode();
        System.out.println("Hash code of '" + input + "': " + hashCode);
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        int value = hashMap.get("two");
        System.out.println("Value associated with 'two': " + value);
        boolean containsKey = hashMap.containsKey("four");
        System.out.println("'four' exists in the hash table: " + containsKey);
    }
}

