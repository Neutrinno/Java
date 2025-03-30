package lr3.tasks.task7;


public class HeadFirst {

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        System.out.println("Построение списка от головы:");


        for (int i = 5; i >= 1; i--) {
            ListNode newNode = new ListNode(i);
            newNode.next = head;
            head = newNode;

            System.out.print("После добавления " + i + ": ");
            printList(head);
        }

        System.out.println("\nИтоговый список:");
        printList(head);
    }


    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }
}