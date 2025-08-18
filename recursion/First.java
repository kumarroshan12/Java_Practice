package recursion;

import java.util.*;

public class First {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Node insert(int data, Node head, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;

    }

    public static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

    }

    public static Node deletebyPos(Node head, int pos) {
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;

    }

    public static void middleNode(Node head) {
        Node slowptr = head;
        Node fastptr = head;
        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        System.out.println(slowptr.data + " ");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Node head = null;
        head = First.insert(10, head, 0);
        head = First.insert(20, head, 1);
        head = First.insert(30, head, 2);
        middleNode(head);

    }

}