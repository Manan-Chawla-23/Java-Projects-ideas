
import java.lang.StringBuffer;
import java.lang.StringBuilder;
public class strings
{
    public static String join(String[] array)
    {
        StringBuilder r= new StringBuilder();
        for(String str : array)
        {
            r.append(str);
        }
        return r.toString();
    }
    public static void main(String[]args)
    {
       

        

        int n = 10;
        String result = (n > 10) ? "Positive" : "Negative";
        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println("Yash Singh");
        }

        int[] arr = new int[5];

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        for (int j = 0; j < 5; j++) {
            System.out.println(arr[j]);
        }

        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }

        String greet = "HI";
        String Name = greet + "Manan";
        System.out.println(Name);
        int length = Name.length();
        System.out.println(length);

        int number = 44;
        String no = Integer.toString(number);
        System.out.println(no);

        char ch;
        ch = "abc".charAt(1);
        System.out.println(ch);

        int start = 10;
        int end = 14;
        String S = "This is a demo line";
        char[] S1 = new char[end - start];
        S.getChars(start, end, S1, 0);
        System.out.println(S1);

        String C1 = "hi world";
        String C2 = "HI WORLD";
        System.out.println("This is " + C1.equals(C2));
/* 
        String lines="Now its time to forget you";
        System.out.println(lines.indexOf(t));
        System.out.println(lines.lastIndexOf(t));
*/
        String car= "Mercs".replace('w', 'M');
        System.out.println(car);

        String book="ECOMMERCE";
        String lcase=book.toLowerCase();
        System.out.println(lcase);

        String GTA="Vice City";
        String Ucase=GTA.toUpperCase();


        System.out.println(Ucase);


        String walking = "hlo";
String footpath = "hlo";
System.out.println(walking.length());
System.out.println(footpath.length());
String nisha=walking+footpath;
System.out.println(nisha);


System.out.println(walking.equals(footpath));

StringBuffer sb= new StringBuffer("NISHAsingh");
int cap=sb.capacity();
System.out.println(cap);
sb.setLength(10);
System.out.println(sb);
sb.append("WEDS YASH");
System.out.println(sb);
sb.reverse();
System.out.println(sb);
String sub=sb.substring(5);
System.out.println(sub);

    String [] array=new String[2];
    array[0]="Hi";
    array[1]="world";

    String results=join(array) ;
    System.out.println(results);
      
    }
}


