class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Node<Integer> n = new Node<Integer>(10);
        Node<String> n2 = new Node<String>("Amit");

    }
}
