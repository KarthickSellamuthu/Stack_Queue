import java.util.*;
class Node{
    int data;
  Node next=null;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
 class Queue_LL{
    static Node front=null,rear=null;
    public static boolean isEmpty(){
        if(front==null&&rear==null){
            return true;
        }
        else{
            return false;
        }
    }
    public static void enqueue(int element){
        Node newNode=new Node(element);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public static int peek(){
        if(isEmpty()){
            System.out.print("Queue is Empty");
            return -1;
        }
        else{
            return front.data;
        }
    }
        public static void dequeue(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return;
     }
     else{
        Node tempNode=front;
        front=front.next;
        if(front==null);
        rear=null;
        System.out.print(tempNode.data+" ");
     }
    }
}
public class Queue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of element:");
        int N=sc.nextInt();
        System.out.println("Enter the element:");
        Queue_LL queue=new Queue_LL();
        for(int i=0;i<=N;i++){
          queue.enqueue(sc.nextInt());
        }
        System.out.println("Front element : " + queue.peek());
        System.out.println("Inserted element in the queue are: ");
        while(!queue.isEmpty()){
            queue.dequeue();
        }
}
  }
 /*
 OUTPUT:
 Enter the no of element:
3
Enter the element:
10
20
30
Front element : 10
Inserted element in the queue are: 
10 20 30 
 */ 
    

