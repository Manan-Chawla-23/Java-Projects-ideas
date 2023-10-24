import java.util.Scanner;

class student
{
    int roll;
    String name;
    String course;

    void gets()
    {
        Scanner g=new Scanner(System.in);
        System.out.println("Enter your roll number -->");
        roll=g.nextInt();
        System.out.println("Enter your name -->");
        name=g.next();
        System.out.println("Enter your course -->");
        course=g.next();
    }
    void show()
    {
        System.out.println("Student information for Master's");
        System.out.println("Roll number -->"+roll);
        System.out.println("Name -->"+name);
        System.out.println("Course -->"+course);
    }
}

class payment 
{
    Scanner s=new Scanner(System.in);
    float fees;
    void get()
    {
     System.out.println("Enter the fees you are paying for first installment");
     fees=s.nextFloat();
    }
    void display()
    {
        System.out.println("Fees paid -->"+fees);
    }
}

public class inheritence {
  public static void main(String[]args)   
  {
    student s1= new student();
    payment s=new payment();
    s1.gets();
    s.get();
    s1.show();
    s.display();
  }
}
