import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

class Stack{
    Node head;

    public void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        System.out.println("Data pushed : "+node.data);

    }

    public void pop(){

        if(Isempty()) {
            System.out.println("Stack Underflow error");
            return;
        }

        Node tempNode=head;
        head=head.next;
        System.out.println(tempNode.data);
    }

    public void peek(){
        if(Isempty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("peek=" +head.data);
    }

    public void delete(){
        head=null;
    }

    public boolean Isempty(){
        if(head==null) return true;
        return false;
    }

}

class runner{
    public static void main(String[] args){
        Stack st=new Stack();

        st.push(12);
        st.push(20);
        st.push(30);
        st.peek();
        st.pop();
        st.peek();
    }
}