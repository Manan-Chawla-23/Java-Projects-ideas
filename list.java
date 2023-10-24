// F. ARRAY LIST USING THE PACKAGES (JAVA.UTIL.ARRAYLIST)


import java.util.ArrayList;
public class list 
{
  public static void main(String[]args)   
  {
    ArrayList<Integer> a_list = new ArrayList<Integer>();
    a_list.add(100);
    a_list.add(200);
    a_list.add(300);
    a_list.add(400);
    a_list.add(500);

    for (int i = 0; i < a_list.size(); i++) 
    {
        System.out.println("Element of array list -->" + a_list.get(i));
    }
    System.out.println("---------------------------------------");
    ArrayList<String> a_s_list=new ArrayList<String>();
    a_s_list.add("BMW");
    a_s_list.add("MERCS");
    a_s_list.add("FERRAI");
    a_s_list.add("LAMORGHINI");
    a_s_list.add("FIAT");
    System.out.println("List of cars:-");
    for (int i = 0; i < a_s_list.size(); i++) 
    {
        System.out.println("Cars list -->" + a_s_list.get(i));
    }
  }
}
