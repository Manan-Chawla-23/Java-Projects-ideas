public class arth {
    public static void main(String[] args) 
    {
        try 
        {
            int result = 10 / 0; // Attempt to divide by zero
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}

