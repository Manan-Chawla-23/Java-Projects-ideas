import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
public class j02 {
    /**
     * @param args
     */
    public static void main(String[]args)
    {
      ArrayList<String> a1=new ArrayList<String>();
      a1.add("Manan");
      a1.add("Yash");
      a1.add("Sunil"); // for adding the element

      System.out.println(a1);

      a1.remove(1); // for removing the element
      System.out.println(a1);

      a1.add(1,"Yash");
        // if user wants to add any specific element in specific pos. then we have to insert the index
        // of that element 
        // syntax -->    arraylist.add(int index,element);
      System.out.println(a1);


      HashSet<Integer> H=new HashSet<Integer>();
      H.add(100);
      H.add(200);
      H.add(300);

      HashMap<String,Integer> H1=new HashMap<>();
      H1.put("Manan",10);
      H1.put("Yash",20);
      H1.put("Manu",30);
      H1.put("NagaBaba",40);
      System.out.println(H1);

      if(H1.containsKey("Manan"))
      {
        System.out.println("Manan is present");
      }
      else
      {
        System.out.println("Its not here");
      }

      H1.remove("NagaBaba");
      System.out.println(H1);

      Currency c;
      c=Currency.getInstance(Locale.US);
      System.out.println("Symbol-->"+c.getSymbol(Locale.US));
      System.out.println("Name of curreny-->"+c.getDisplayName(Locale.US));

      Date d=new Date();
      System.out.println("Date-->"+d);

    }
    
}
