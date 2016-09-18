package stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> testStack = new Stack();
        testStack.push(3);
        testStack.push(2);
        testStack.push(1);

        System.out.println(testStack.pop());
        System.out.println(testStack.pop());

        testStack.push(99);
        System.out.println(testStack.pop());

        System.out.printf("Count: %d", testStack.getCount());
    }

}
