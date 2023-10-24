import java.util.Stack;

public class stacks {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10); // Pushing elements onto the stack
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek()); // Peek the top element

        while (!st.isEmpty()) {
            System.out.println("Popped: " + st.pop()); // Popping elements from the stack
        }
    }
}
