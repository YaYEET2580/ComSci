package ReverseList;

public class ReverseList {
    private Object[] data;
    private int top;

    public ReverseList(int maxItems) {
        data = new Object[maxItems];
        top = -1;
    }

    public Object top() {
        return data[top];
    }

    public Object pop() {
        top = top - 1;
        return data[top + 1];
    }

    public void push(Object item) {
        if (top < data.length - 1) {
            top = top + 1;
            data[top] = item;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void makeEmpty() {
        top = -1;
    }

}