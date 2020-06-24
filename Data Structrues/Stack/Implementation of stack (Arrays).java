import java.util.*;

class stack{
    int arr[];
    int topOfStack;

    public stack(int size){
        this.arr=new int[size];
        this.topOfStack=-1;
    }

    public void push(int data){

        if(isFull()) System.out.println("Stack Overflow");

        else{
            arr[topOfStack+1]=data;
            topOfStack++;
        }
    }

    public void pop(){

        if(isEmpty()) System.out.println("Stack Underflow");

        else{
            System.out.println(arr[topOfStack]);
            topOfStack--;
        }
    }
    
    public void peek(){
        if(!isEmpty()) System.out.println("peek of stack="+arr[topOfStack]);
        else System.out.println("Stack is empty");
    }

    public boolean isEmpty(){
        if(topOfStack==-1) return true;
        return false;
    }

    public boolean isFull(){
        if(topOfStack==arr.length) return true;
        return false;
    }
    
    public void delete(){
        arr=null;
    }
}

class runner{
    public static void main(String[] args){

        stack st=new stack(5);
        st.push(5);
        st.push(4);
        st.push(10);
        st.push(15);
        st.push(20);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.peek();


    }
}
