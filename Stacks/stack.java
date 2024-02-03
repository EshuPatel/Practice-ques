public class stack{             
    // using array

    int size;
    int stck[];
    int ptr=-1;

    stack(){
        int stck[]= new int[5];        // default size=5
    }
    stack(int size){
        int stck[]= new int[size];
    }

    void push(int val) throws NullPointerException{
        if(ptr==size){
            System.out.println("overflow");
        }
        ptr=ptr+1;
        stck[ptr]=val;
    }

    int pop(){
        if(ptr==-1){
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
    stack st = new stack(3);
    st.isEmpty();
    st.push(9);
    st.push(8);
    st.push(7);
    st.push(6);
    st.pop();
}
}