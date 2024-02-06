public class stackll {
    Node top;
    class Node{     
        int data;
        Node nxt;

        Node(int data){
            this.data=data;
            this.nxt=null;
        }
    }

    void push(int val){
        Node node=new Node(val);
        if (top==null){
            top=node;
            return;
        }
        node.nxt=top;
        top=node;
    }

    // printing stack
    void print(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.nxt;
        }
        System.out.println("null");
    }
    
    // pop from stack(delend)
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        Node temp=top;
        Node slast=temp;
        while(temp!=null){
            if(temp.nxt==null){
                slast.nxt=null;
                break;
            }
            slast=temp;
            temp=temp.nxt;
        }
        return temp.data;
    }

    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        stackll sl=new stackll();
        sl.push(5);
        sl.push(4);
        sl.push(3);
        sl.push(2);
        sl.push(1);
        sl.print();
        System.out.println(sl.pop());
        sl.print();
        
    }

    
}
