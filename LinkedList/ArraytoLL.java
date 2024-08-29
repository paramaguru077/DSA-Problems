package LinkedList;

public class ArraytoLL {
    private static Node convertArrtoLL(int[] arr){
          Node head = new Node(arr[0]);
          Node mover = head;
          for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp; 
          }
          return head;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Node head = convertArrtoLL(arr);
        System.out.println(head.data);

    }
}
class Node{
    int data;
    Node next;
    Node(){
        this.data=0;
        this.next=null;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data, Node next){
        this.data=0;
        this.next=next;
    }
}