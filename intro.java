public class intro 
{
    public static void swap(int a, int b) 
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped digits are --> a: " + a + ", b: " + b);
    }
     /*  for printing the display we use sout or System.out.println();
         we also use print() in place of println.
         the major difference between print or println is that :-
         print just display the output while println display with next line space also
         every variable is implemented in a same manner using the syntax
         data_type variable name=value;
         if the data type is of char or string we write value in quote or double quote
     */
    public static void main(String[] args) 
    {
        System.out.print("Hi, this is the first program where we are going to learn about the basics of Java\n");

        int x = 123;
        double y = 3.14;
        boolean choice = true;
        char symbol = '$';
        String name = "Manan";

        System.out.println(x);
        System.out.println(y);
        System.out.println(choice);
        System.out.println(symbol);
        System.out.println(name);

        // For swapping two strings
        String n1 = "Monster";
        String n2 = "hunter";
        String temp;
        temp = n2;
        n2 = n1;
        n1 = temp;
        System.out.println("Swapped strings are --> n1: " + n1 + ", n2: " + n2);
        System.out.println("Concatenated strings: " + n2+ temp);

        // For swapping two numbers using the function
        int a = 100;
        int b = 200;
        swap(a, b);
    }
}
