public class LinkedListRaw {
    Node head;

    public void add(String data){
        //if LL is empty, head of LL will be the Node object added
        if(this.head==null){
            this.head = new Node(data);
        }
        else{
            //if LL is not empty, added Node object becomes the head and current head becomes next
            Node nodeToAdd = new Node(data);
            nodeToAdd.nextData = this.head;
            this.head = nodeToAdd;
        }
    }
}
