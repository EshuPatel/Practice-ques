public class stack{             
    // using array

    private int size;
    private int ptr=-1;
    private int stck[];

    stack(){
         stck= new int[5]; 
         size =5;       // default size=5
    }
    stack(int size){
         stck= new int[size];
         this.size=size;
    }

    void push(int val) {
        if(isFull()){
            System.out.println("overflow");
             return;
        }
        ptr=ptr+1;
        stck[ptr]=val;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("can't pop from empty stack");
            return -1;
        }
        ptr--;
        return stck[ptr+1];
    }

    int top(){
        return stck[ptr];
    }

    boolean isEmpty(){
        if (ptr==-1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if (ptr==size){
            return true;
        }
        return false;
    }

public static void main(String[] args) {
    stack st = new stack(4);
    st.isEmpty();
    st.push(9);
    System.out.println(st.top());
    st.push(8);
    st.push(7);
    System.out.println(st.top());
    st.push(6);
    st.pop();
    System.out.println(st.top());
    st.pop();
    st.isFull();
}
}