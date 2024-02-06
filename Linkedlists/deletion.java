public class deletion extends basics {

    // delete head
    void delBeg(){
        if(head!=null){
            head=head.nxt;
            return;
        }
        else{
            System.out.println("underflow");
        }
    }

    // delete from end
    void delEnd(){
        if (head==null){
            System.out.println("underflow");
            return;
        }
        Node sl=head;
        Node lnode=sl.nxt;
        while(lnode!=null){
            if(lnode.nxt==null){
                sl.nxt=null;
            }
            sl=lnode;
            lnode=lnode.nxt;
        }
    }
    // from position
    void delPos(int index,int size){
        if(index>size){
            System.out.println("length exceeded");
        }
        Node curr=head;
        Node prev=head;
        for(int i=0; i<=index; i++){
            if(i==index){
                curr.nxt=prev.nxt;
                return;
            }
            curr=prev;
            prev=prev.nxt;
        }
        
        
    }
    public static void main(String[] args) {
        deletion d =new deletion();
        d.insertBeg("Eshu");
        d.insertBeg("me");
        d.insertBeg("is");
        d.insertBeg("this");
        d.printLs();
        d.delBeg();
        d.printLs();
        d.delEnd();
        d.printLs();
        d.delPos(1,2);
        d.printLs();
    
    }
}
