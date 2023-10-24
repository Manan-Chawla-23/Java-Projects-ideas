import java.util.HashSet;
import java.util.Iterator;
public class hash01 {
    public static void main(String[]args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(400); // duplicate values are not allowed in hash
        System.out.println("Hash set element-->"+set);
        int se=200;
        if(set.contains(se))   // for searching element in hash 
        {
            System.out.println("It is here");
        }
        else
        {
            System.out.println("Not found or present");
        }
        int re=400;
        if(set.remove(re))  // removing element 
        {
            System.out.println("it is removed");
        }
        else
        {
            System.out.println("it cant be removed");
        }
    }
}
