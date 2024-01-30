public class deletion extends basics {

    Node head;
    class Node{
        String data;
        Node nxt;

        Node (String new_data){
            this.data= new_data ;
            this.nxt =null;
        }
    } 
    
    // delete head
    public void delBeg(){
        Node temp=head.nxt;
        head=temp;
    }
    
    public static void main(String[] args) {
        deletion d =new deletion();
        d.insertBeg("Eshu");
        d.insertBeg("me");
        d.insertBeg("is");
        d.insertBeg("this");
        System.out.println(d.head.data);
        d.printLs();
        d.delBeg();
        d.printLs();

    }
}
