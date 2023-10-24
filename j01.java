import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class j01
{
    public static void main(String[]args) throws IOException
    {
        Double d1 = 123.456;
        System.out.println("Value of double-->"+d1);


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i;
        int sum=0;
        System.out.println("Enter no 0 to quit");
        do{
            s=br.readLine();
            try
            {
                i=Integer.parseInt(s);
            }
            catch(NumberFormatException e)
            {
                i=0;
            }
            sum+=i;
            System.out.println("Sum-->"+sum);
        }while(i!=0);
    }
}