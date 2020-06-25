class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

class CircularLinkedList{
    Node tail;
    int size;

    public void add(int data){

        Node node = new Node(data);

        if(tail==null){
            tail=node;
            tail.next=node;
        }
        else{
            node.next=tail.next;
            tail.next=node;
            tail=node;   
        }
        size++;
    }

    public void addAtBegning(int data){

        Node node = new Node(data);

        if(tail==null) add(data);

        else{
            node.next=tail.next;
            tail.next=node;
        }
        size++;
    }

    public void addAt(int index, int data){

        Node node = new Node(data);

        if(index==0) addAtBegning(data);

        else{

            Node current = tail.next;
            for(int i=0; i<index-1; i++){
                current=current.next;
            }
            node.next=current.next;
            current.next=node;
        }
        size++;

    }

    public int getSize(){
        return size;
    }

    public void show(){

        Node current=tail.next;
        while(current!=tail){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
    }

}
class runner{
    public static void main(String[] args){
        CircularLinkedList list=new CircularLinkedList();

        list.add(10);
        list.add(5);
        list.add(7);
        list.add(1);
            
        list.show();
    }
}