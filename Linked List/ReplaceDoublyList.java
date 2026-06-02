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

    void replace(int oldValue, int newValue) {
        Node current = head;

        while (current != null) {
            if (current.data == oldValue) {
                current.data = newValue;
                return;
            }
            current = current.next;
        }
    }
}

public class ReplaceDoublyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        int n = sc.nextInt();
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());

            if (list.head == null) {
                list.head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        int oldValue = sc.nextInt();
        int newValue = sc.nextInt();

        list.replace(oldValue, newValue);

        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}