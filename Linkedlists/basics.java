public class basics {
// Insertion in linkeed lists
    Node head; 
    class Node{

        String data;
        Node nxt;

        // constructor for new node
        Node(String new_data){
            this.data= new_data ;
            this.nxt =null;
        }
    }

    public void insertBeg(String new_data){
        Node new_node= new Node(new_data);
        new_node.nxt=head;
        head= new_node;
    }

    public void insertEnd(String new_data){
        Node new_node= new Node(new_data);
        if( head==null){
            head=new_node;
            return;
        }
        Node curr=head;
        while(curr.nxt!=null){
            curr=curr.nxt;}
        curr.nxt=new_node;
    }

    public void insertAfter(String new_data, Node prev_node){
        Node new_Node =new Node(new_data);
        // check if node exists
        if(head==null){
            head=new_Node;
        }
        // traverse and find prev_node
        Node curr=head;
        Node currNxt=curr.nxt;
        while (curr!=null) {
            if (curr==prev_node){
                curr.nxt=new_Node;
                new_Node.nxt=currNxt;
            }
            curr=curr.nxt;
            currNxt=curr.nxt;
        }

    }

    public void printLs(){
        Node curr=head;
        if ( head==null){
            System.out.println("empty list");
            return ; 
        }
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.nxt;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        basics bs= new basics();
        bs.insertBeg("this");
        bs.printLs();
        bs.insertEnd("list");
        bs.printLs();
        bs.insertAfter("is", bs.head);

        
    }
} 