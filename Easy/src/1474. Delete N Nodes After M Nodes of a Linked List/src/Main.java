public class Main {
    public static ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;
        while (current != null) {
            // Сохраняем m узлов
            for (int i = 0; i < m - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                break;
            }

            // Пропускаем n узлов
            ListNode temp = current.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            current.next = temp; // Связываем текущий узел с узлом после удалённых
            current = temp; // Переходим к следующему узлу для обработки
        }
        return head;
    }

    public static void main(String[] args) {
        // Создаем тестовый список: 1 -> 2 -> ... -> 13
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 13; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        System.out.println("Исходный список:");
        printList(head);

        int m = 2, n = 3;
        ListNode result = deleteNodes(head, m, n);

        System.out.println("\nРезультат после deleteNodes(" + m + ", " + n + "):");
        printList(result); // Должно быть: 1 -> 2 -> 6 -> 7 -> 11 -> 12
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
    }
}
