package LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(E data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index > 0 || index <= numNodes) {
            Node temp;
            temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        } else if (index == 0) {
            head = new Node(element);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public void addFist(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(element);
        temp.next = newNode;
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index " + index + "exceeds position in array!");
        }
        Node temp = head;
        E element;
        if (index == 0) {
            element = (E) head.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            element = (E) temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return element;
    }

    public int size() {
        return numNodes;
    }

    public void show() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int indexOf(E element) {
        int index = -1;
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return index;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new RuntimeException("Index " + index + "exceeds position in array!");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            throw new NullPointerException("No data at index " + index);
        }
        E element;
        element = (E) temp.next.data;
        return element;
    }
}
