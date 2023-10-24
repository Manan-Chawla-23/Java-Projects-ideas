import java.net.URL;
import java.net.MalformedURLException;

public class url
{
    public static void main(String[]args)
    {
        try{
            URL ul=new URL("https://www.transformers-universe.com/include.php?path=start.php");

            System.out.println("Protocol -->"+ul.getProtocol());
            System.out.println("HostName -->"+ul.getHost());
            System.out.println("PortNo. -->"+ul.getPort());
            System.out.println("FileName -->"+ul.getFile());
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}