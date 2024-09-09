package Stack;

public class StackTest {

    public static void main(String[] args) {
        // Test with LinkedListStack
        Stack<Integer> intStack = new LinkedListStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("LinkedListStack (Integer):");
        System.out.println("Top element: " + intStack.peek()); 
        System.out.println("Pop element: " + intStack.pop());  
        System.out.println("Is empty: " + intStack.isEmpty());
        System.out.println();

        
        Stack<String> stringStack = new ArrayStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("!");
        System.out.println("ArrayStack (String):");
        System.out.println("Top element: " + stringStack.peek()); 
        System.out.println("Pop element: " + stringStack.pop());  
        System.out.println("Is empty: " + stringStack.isEmpty()); 
        System.out.println();

     
        Stack<Character> charStack = new LinkedListStack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        System.out.println("LinkedListStack (Character):");
        System.out.println("Top element: " + charStack.peek()); 
        System.out.println("Pop element: " + charStack.pop());  
        System.out.println("Is empty: " + charStack.isEmpty()); 
    }
}
