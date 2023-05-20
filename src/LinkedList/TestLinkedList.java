package LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> test = new MyLinkedList<>(3);
        test.addFist(2);
        test.addFist(1);

        test.add(3,4);
        test.add(4,5);

        test.addLast(6);
        test.addLast(7);

        test.show();
        System.out.println(  test.remove(2));
        System.out.println(test.size());
        System.out.println();
        System.out.println(test.indexOf(2));
        System.out.println(test.get(2));
    }
}
