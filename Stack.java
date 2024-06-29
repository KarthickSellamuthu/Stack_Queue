import java.util.*;            //pakages
class node{
    int data;
    node next=null;              //node class
}
class Stack_LL{
    static node top=null;         //Stack class
    public static boolean IsEmpty()
    {
        if(top==null){
            return true;
        }
        else{
            return false;
        }

    }
    public  void push(int element){
        node newNode=new node();
        
            newNode.data=element;
            newNode.next=top;
            top=newNode;
     
    }
    public static int Peek(){
        if (IsEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return top.data;
        }
    }
    public static void pop(){
        if (IsEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        else{
            System.out.print(Peek()+" ");
            top=top.next;
        }
    }
}
 public class Stack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total elements : ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        Stack_LL Stack=new Stack_LL();
        for(int i=1;i<=n;i++){
            Stack.push(sc.nextInt());
        }
        System.out.println("Top element : "+ Stack_LL.Peek());
        System.out.println("Inserted elements in stack are :");
        while (!Stack_LL.IsEmpty()) {
            Stack_LL.pop();
        }
        sc.close();
    }
    
}
/*Output:
Enter total elements : 5
Enter Elements : 3 6 3 12 15
Top element : 15
Inserted elements in stack are :
15 12 9 6 3 
 * 
 */