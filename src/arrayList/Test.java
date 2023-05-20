package arrayList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> elements = new MyList<>(5);
        elements.add(5);
        elements.add(4);
        elements.add(3);
        elements.add(2);

        elements.add(4,7);
        elements.add(4,6);
        elements.show();
        elements.size();
        elements.remove(1);
        elements.show();
        System.out.println(elements.get(2));
        System.out.println(elements.indexOf(3));;
    }
}
