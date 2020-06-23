import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

public class SinglyLinkedList{
    Node head;

    public void add(int data){
        Node node=new Node(data);
        node.next=null;

        if(head==null) head=node;

        else{
            Node current=head;

            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
    }

    public void addAtBegning(int data){

        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public void addAt(int index, int data){

        Node node=new Node(data);

        if(index==0)  addAtBegning(data);

        else{

            Node current=head;
            for(int i=0; i<index-1; i++){
                current=current.next;
            }
            node.next=current.next;
            current.next=node;
        }
    }

    public void delete(int index){

        if(index==0) head=head.next;
        
        else{

            Node current=head;
            Node n=null;

            for(int i=0; i<index-1; i++){
                current=current.next;
            }

            n=current.next;
            current.next=n.next;
            n.next=null;

        }
    }

    public void show(){
        Node current = head;
        while(current.next!=null){
            System.out.println(current.data);
            current=current.next;
        }

        System.out.println(current.data);
    }
}

class runner{
public static void main(String[] args){
    SinglyLinkedList list=new SinglyLinkedList();
    list.add(10);
    list.add(20);
    list.add(40);
    list.add(100);
    list.addAtBegning(86);
    list.add(95);
    list.addAt(2, 45);
    list.addAt(0,800);
    list.addAt(6, 456);
    list.delete(7);
    list.delete(7);
        

    list.show();
    
    }
}