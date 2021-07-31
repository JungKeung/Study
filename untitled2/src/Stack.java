class JkStack {

    int top;
    int[] stack;
    int size;
//-1로 잡으면 스택의 top은 데이터의 위치와 동일하고, 0으로 잡으면 다음 데이터의 위치를 가리키게 된다.
    public JkStack(int size) {
        top = -1;
        stack = new int[size];
        this.size = size;
    }

    public int peek() {
        return stack[top];
    }

    public void push(int value) {
        stack[++top] = value;
        System.out.println(stack[top] + " Push");
    }

    public int pop() {
        System.out.println(stack[top] + " Pop");
        return stack[top--];
    }

    public void printStack() {
        System.out.println("-- Stack List --");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);
        System.out.println("-- End List --");
    }
}

public class Stack {

    public static void main(String args[]) {

        // 스택 동작 테스트
        JkStack st = new JkStack (100);

        st.push(5);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(1);

        st.printStack();

        st.pop();

        st.pop();

        st.push(15);

        st.printStack();

        st.peek();

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.push(30);
        st.peek();
    }
}
