class Queue{

    int arr[];
    int size;
    int length;
    int front;
    int rear;

    Queue(int len){
        this.length=len;
        this.arr=new int[length];
    }

    public void enQueue(int data){

        if(!Isfull()){
        arr[rear]=data;
        rear=(rear+1)%length;
        size++;
        }

        else System.out.println("Queue is Full");
    }

    public int deQueue(){

        int data=arr[front];

        if(!Isempty()){
        front=(front+1)%length;
        size--;
        }
        else System.out.println("Queue is Empty");

        return data;
    }

    public int getSize(){
        return size;
    }

    public boolean Isempty(){
        return getSize()==0;
    }

    public boolean Isfull(){
        return getSize()==length;
    }

    public void show(){
        for(int i=0; i<size; i++){
            System.out.print(arr[(i+front)%length]+" ");
        }
    }


}

class runner{
    public static void main(String[] args){

        Queue queue=new Queue(5);

        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(7);
        queue.enQueue(3);       
        queue.enQueue(9);
        queue.enQueue(1);

        queue.show();

    }
}