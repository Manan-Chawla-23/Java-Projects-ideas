import java.util.ArrayList;
public class array_list {
    public static void main(String[]args)
    {
        ArrayList <Integer> LS=new ArrayList<>();
        LS.add(100);
        LS.add(200);
        LS.add(300);
        LS.add(400);
        LS.add(500);

        for(int i=0;i<LS.size();i++)
        {
            System.out.println("Array list -->"+LS.get(i));
        }
        System.out.println("After deleting the element-->");
        LS.remove(1);
        for(int i=0;i<LS.size();i++)
        {
            System.out.println("Array list -->"+LS.get(i));
        }

        ArrayList <String> STR= new ArrayList<>();
        STR.add("car");
        STR.add("truck");
        STR.add("train");
        STR.add("planes");
        for(int i=0;i<LS.size();i++)
        {
            System.out.println("Array list -->"+STR.get(i));
        }
        STR.remove(1);
    }
}
