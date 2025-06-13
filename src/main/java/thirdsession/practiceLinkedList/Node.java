package thirdsession.practiceLinkedList;

public class Node {
    String name;
    String address;
    Node next; // memeoria cime a kovetkezo elemnek

    public Node(String name, String address) {
        this.name = name;
        this.address = address;
        this.next = null; // itt meg nullt allit be, mert elso korben nem mutat sehova, nincs masodik elem.
    }
}
