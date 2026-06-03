import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head;
    void reverseEvenOdd(){
        if(head==null) return;

        Node oddHead=null, oddTail=null;
        Node evenHead=null, evenTail=null;
        Node current=head;

        while(current!=null){
            if(current.data%2==0){
                if(evenHead==null){
                    evenHead=evenTail=current;
                } else {
                    evenTail.next=current;
                    evenTail=current;
                }
            } else {
                if(oddHead==null){
                    oddHead=oddTail=current;
                } else {
                    oddTail.next=current;
                    oddTail=current;
                }
            }
            current=current.next;
        }

        if(oddTail!=null) oddTail.next=null;
        if(evenTail!=null) evenTail.next=null;

        if(oddHead==null){
            head=evenHead;
        } else {
            head=oddHead;
            if(evenHead!=null){
                oddTail.next=evenHead;
            }
        }
    }
}   