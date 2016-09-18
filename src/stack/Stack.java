package stack;

public class Stack<T> {

    private int count;
    private Node<T> first = null;

    public T pop() {
        if (first != null) {
            Node<T> currentFirst = first;
            first = first.next;
            count--;
            return currentFirst.value;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void push(T value) {
        Node<T> newNode = new Node();
        newNode.value = value;
        if (first != null) {
            newNode.next = first;
            first = newNode;
        }
        else {
            first = newNode;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    private class Node<T> {
        public T value;
        public Node<T> next = null;
    }
}
