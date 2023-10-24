import java.util.HashMap;
public class hmap {
public static void main(String[]args)
{
    HashMap<String,Integer> map=new HashMap<>(); // for creating
    map.put("BMw",300);
    map.put("MERCS",400);
    map.put("FORD",500);
    map.put("TATA",600);
    if(map.containsKey("MERCS"))  // for searching 
    {
        System.out.println("KEy is present");
    }
    else
    {
        System.out.println("Key is not present");
    }
    System.out.println(map); // for printing
    map.remove("BMw");  // for removing 
    System.out.println(map);
}
}
