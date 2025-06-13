package thirdsession.practiceLinkedList;

public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = null; // meg alapbol ures
    }
    void addCustomer(String name, String address){
        Node newNode = new Node(name,address);

        if(head == null){
            head = newNode;
        }else {
            Node current = head;

            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // Method to remove a specific customer from the waitlist
    void removeCustomer(String customerName) {
        if (head == null) return; // If the waitlist is empty, there's nothing to remove
        // If the customer to remove is at the head of the list
        if (head.name.equals(customerName)) {
            head = head.next; // Move the head to the next customer
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.name.equals(customerName)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next; // Bypass the node to remove the customer
        }
    }
    void updateCustomer(String customerName, String newDetails) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(customerName)) {
                current.address = newDetails; // Update the customer’s address
                return;
            }
            current = current.next;
        }
    }
}
