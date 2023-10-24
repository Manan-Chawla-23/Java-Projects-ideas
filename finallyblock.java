public class finallyblock 
{
    public static void main(String[] args) 
    {
        /*
 * In this example, we demonstrate the use of the finally block regardless of whether
 *  an exception is thrown or not, the code within the finally block always executes.
 */
        try 
        {
            int result = 10 / 0; // Attempt to divide by zero
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally 
        {
            System.out.println("This block always executes, even if an exception occurs.");
        }
    }
}
