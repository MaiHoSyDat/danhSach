package LinkedList;

public class Node {
    protected Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }
    public Object getData(){
        return this.data;
    }
}
