public class Pilha {

    private int[] stackArray;
    private int top;

    public Pilha(int size) {
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (this.isFull()) {
            throw new StackOverflowException("Pilha cheia");
        }
        this.top++;
        this.stackArray[this.top] = element;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new StackEmptyException("Pilha vazia");
        }
        int element = this.stackArray[this.top];
        this.top--;
        return element;
    }

    public boolean isFull() {
        return this.top == this.stackArray.length - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int top() {
        if (this.isEmpty()) {
            throw new StackEmptyException("Pilha vazia");
        }
        return this.stackArray[this.top];
    }
}
