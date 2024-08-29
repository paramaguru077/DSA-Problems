package LinkedList;

public class LinkedList {
    Node head;
   class Node{
    int data;
    Node next;
    Node(int val){
        data= val;
        next=null;
    }
   }
   LinkedList(){
    head=null;
   }
   public void insetAtBeginning(int val){
    Node newNode = new Node(val);
    if(head==null){
        head= newNode;
    }
    else{
        newNode.next=head;
        head=newNode;

    }


   }
   public void travelsal(){
    Node temp =head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp= temp.next;
    }
   }
   public void insertAtMiddle(int pos, int val){
    Node newNode = new Node(val);
    Node temp=head;
    for(int i=1;i<pos;i++){
        temp= temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
   }
   public void deleteAtpos(int pos){
    Node temp= head;
    Node prev=null;
    for(int i=1;i<=pos;i++){
        prev=temp;
        temp=temp.next;

    }
    prev.next=temp.next;
    
   }

}

