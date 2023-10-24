import java.util.Scanner;
public class user_input {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("yes you can vote in the election");
        }
        else
        {
            System.out.println("sorry! you are not eligible for voting ");
        }
        System.out.println("Enter your name");
        String Name=sc.next();
        System.out.println("Name-->"+Name);
        System.out.println("Age-->"+age);
        sc.close();
    }
}
