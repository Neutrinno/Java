package lr3.tasks.task8;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public LinkedList() {
        head = null;
    }

    public void createHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }


    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public void insert(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Position out of range");
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int position) {
        if (position == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Position out of range");
        }
    }

    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        Node newNode = new Node(data);
        newNode.next = node;
        return newNode;
    }

    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }

    private Node createTailRecHelper(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        node.next = createTailRecHelper(node.next, data);
        return node;
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "null";
        }
        return node.data + " -> " + toStringRecHelper(node.next);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Итеративный ввод и вывод
        list.createHead(1);
        list.createTail(2);
        list.addFirst(0);
        list.addLast(3);
        list.insert(4, 2);
        System.out.println("Список после операций (итеративно): " + list.toString());

        list.removeFirst();
        list.removeLast();
        list.remove(2);
        System.out.println("Список после удаления (итеративно): " + list.toString());


        list.createHeadRec(5);
        list.createTailRec(6);
        System.out.println("Список после операций (рекурсивно): " + list.toStringRec());
    }
}
