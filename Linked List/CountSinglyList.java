import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    int CountNodes(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
public class CountSinglyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (list.head == null) {
                list.head = newNode;
            } else {
                Node current = list.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        int count = list.CountNodes();
        System.out.println("Number of nodes in the list: " + count);
    }
}