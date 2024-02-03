public class dll{
    // insert at beg and end
    Node Head;
    Node tail;
    int size=0;

    class Node{
        int data;
        Node prev;
        Node nxt;

        Node(int n_data){
            this.data= n_data;
            this.prev=null;
            this.nxt= null;
        }
    }
// insertion in beginning
     void insertBeg(int new_data){
        Node n =new Node(new_data);
        if (Head==null){
            Head=n;
            return ;
        }

        n.nxt=Head;
        Head.prev=n;
        Head=n;
        size++;
    }

    // insertion at end
    void insertEnd(int new_data){
        Node node= new Node(new_data);
        if (Head==null){
            Head=node;
        }
        Node temp=Head;
        while(temp!=null){
            if(temp.nxt==null){
                temp.nxt=node;
                node.prev=temp;
                size++;
                break;
            }
            temp=temp.nxt;
        }
    }

    void insertPos(int data, int pos)
    {}

    void prntLs(){
        if(Head==null){
            System.out.println("empty lst");
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.nxt;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        dll d= new dll();
        d.insertBeg(5);
        d.insertBeg(6);
        d.insertBeg(7);
        d.prntLs();
      d.insertEnd(12);
      d.prntLs();
}}