import java.util.*;  
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null)
            head = temp.prev;
    }
}

public class ReverseDoublyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node tail = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (list.head == null) {
                list.head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        System.out.println("Original List:");
        printList(list.head);

        list.reverse();

        System.out.println("Reversed List:");
        printList(list.head);

        sc.close();
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}