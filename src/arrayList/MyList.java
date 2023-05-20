package arrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void newArrays() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            newArrays();
        }
        if (index >= 0 && index <= size) {

            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        } else {
            throw new RuntimeException("Index "+ index +" is not of Size!");
        }
    }

    public void add(E element) {
        if (size == elements.length) {
            newArrays();
        }
        elements[size] = element;
        size++;
    }

    public void size() {
        System.out.println("Size of array : " + size);
    }

    public E remove(int index) {
        if (index < 0 && index >= size) {
            throw new RuntimeException("Index is not of Size!");
        }
        E element = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return element;
    }

    public E get(int index) {
        if (index < 0 && index >= size) {
            throw new RuntimeException("Index is not of Size!");
        }
        return (E) elements[index];
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.println("Element of "+i+" : " + elements[i]);
        }
    }
}
