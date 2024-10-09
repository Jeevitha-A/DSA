import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Main {
    public static Node reverseList(Node head) {
       Node prev = null;
       Node curr = head;
       Node upc = curr.next;
       while(curr.next!=null){
           curr.next = prev;
           prev = curr;
           curr = upc;
           upc = curr.next;
       }
       curr.next = prev;
       prev = curr;
       head = prev;
       return head;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            list.add(x);
        }

        list.head = reverseList(list.head);
        list.printList();
    }
}
