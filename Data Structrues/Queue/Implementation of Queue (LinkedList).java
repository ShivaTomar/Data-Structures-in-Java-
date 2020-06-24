class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

class QueuebyLinkedList{
    Node head;
    Node tail;
    int size;

    public void enQueue(int data){

        Node node=new Node(data);
        node.next=null;

        if(Isempty()){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;

    }

    public int deQueue(){

        if(Isempty()){

            System.out.println("Queue is Empty");
            return -1;
        }

        Node tmpNode=head;
        head=head.next;

        size--;
        return tmpNode.data;
    }

    public int Peek(){

        if(Isempty()){

            System.out.println("Queue is Empty");
            return -1;
        }

        return head.data;
    }

    public void delete(){
        head=null;
    }

    public boolean Isempty(){
        return head==null;
    }

    public int getSize(){
        return size;
    }

    public void show(){

        Node current = head;

        while(current.next!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(current.data+" ");
        System.out.println("");
    }
}

class runner{
    public static void main(String[] args){

        QueuebyLinkedList q=new QueuebyLinkedList();
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(20);
        q.enQueue(100);
        int x= q.Peek();
        System.out.println(x);
        System.out.println(q.getSize());
        q.deQueue();
        System.out.println(q.getSize());
        x= q.Peek();
        System.out.println(x);
        q.show();
    }
}