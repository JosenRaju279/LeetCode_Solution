public class MinStack {

    private int[] values;
    private int[] min;
    private int top;

    public MinStack() {
        values = new int[10];
        min = new int[10];
        top = -1;
    }

    public void push(int value) {
        if (top == values.length - 1) {
            resize();
        }

        top++;

        values[top] = value;

        if (top == 0) {
            min[top] = value;
        } else {
            min[top] = Math.min(value, min[top - 1]);
        }
    }

    public void pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        top--;
    }

    public int top() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return values[top];
    }

    public int getMin() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return min[top];
    }

    private void resize() {
        int newcap = values.length * 2;

        int[] newval = new int[newcap];
        int[] newmin = new int[newcap];

        for (int i = 0; i <= top; i++) {
            newval[i] = values[i];
            newmin[i] = min[i];
        }

        values = newval;
        min = newmin;
    }
}
