public class LinkedList{
    
    static class Node {
        int year;
        String event;
        Node next;
            
    Node (int year, String event) {
        this.year = year;
        this.event = event;
        this.next = null;
    }
}

private Node head;

public LinkedList() {
    head = null;
}

public void addEvent(int year, String event) {
    Node newNode = new Node(year, event);
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

public static void main (String[] args) {
    LinkedList timeline = new Linkedlist();
    
    timeline.addEvent(-753, "Fundación de Roma (fecha tradicional)");
    timeline.addEvent(-509, "Establecimiento de la República Romana");
    timeline.addEvent(-44, "Asesinato de Julio César");
    timeline.addEvent(27, "Augusto se convierte en el primer emperador romano");
    timeline.addEvent(476, "Caída del Imperio Romano de Occidente");
    
    System.out.println("Línea temporal de la historia romana:");
    timeline.displayEvents();
    
}
}