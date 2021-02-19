/**
 * This is the List class. I couldn't fully understand what the prompt was
 * asking for so I'm not sure that I necessarily did this in the way that you
 * originally requested in the assignment file so please feel free to clarify
 * what changes would need to be implemented.
 */
public class List {
    // The head of the list.
    private Node head;
    // The pool to hold nodes that aren't being used.
    private ObjectPool thePool;

    /**
     * Default constructor. Builds a default object pool to hold nodes that aren't
     * actively being used.
     */
    List() {
        this.head = null;
        this.thePool = new ObjectPool();
    }

    /**
     * This is the insert function for the List.
     * 
     * @param toInsert The data we'd like to insert.
     */
    public void insert(String toInsert) {
        this.head = this.thePool.getNode(toInsert, this.head);
    }

    /**
     * This is the print wrapper to the private recurisve method.
     */
    public void print() {
        print(this.head, 1);
    }

    /**
     * This is the recursive print function. It traverses to the end and prints the
     * statistics from the pool and then goes back and prints the list backwards.
     * 
     * @param head
     */
    private void print(Node head, int howmany) {
        if (head == null) { // At the end of the List.
            System.out.println(thePool.showStats() + " " + howmany + " Nodes in the list."); // Print pool statistics
            return;
        }
        print(head.getNext(), howmany + 1); // Move forward.
        System.out.println(head.getData()); // Postorder Print
    }

    /**
     * The recursive wrapper to remove an item from the list.
     * 
     * @param toRemove The data to remove.
     */
    public void remove(String toRemove) {
        this.head = remove(this.head, toRemove);
    }

    /**
     * This is the recursive wrapper to remove an item from the list. It reconnects
     * as it goes back.
     */
    private Node remove(Node head, String toRemove) {
        if (head == null) { // If we're at the end.
            return null;
        }
        if (head.getData().equals(toRemove)) { // Did we find it.
            Node temp = head.getNext(); // Hold the next value.
            thePool.recycle(head); // Recycle the node.
            return temp; // Return next node to reconnect.
        }
        return head.setNext(remove(head.getNext(), toRemove)); // Tail recursion is pretty nice I hear.
    }
}
