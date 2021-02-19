/**
 * This is the Node class, it will handle anything to do with the specific data.
 */
public class Node {
    private String data = "";
    private Node next = null;

    /**
     * Constructor for the Node
     * 
     * @param data Data in the node
     * @param next The next node
     */
    Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Returns the next node.
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Sets the next value to the value passed in as a parameter.
     * 
     * @param toSet The node that the client wants to set the next value to.
     * @return Returns itself.
     */
    public Node setNext(Node toSet) {
        this.next = toSet;
        return this;
    }

    /**
     * This function is for returning the data value.
     * 
     * @return Returns the data held in the node.
     */
    public String getData() {
        return this.data;
    }

    /**
     * This function is for setting the data value for the Node.
     * 
     * @param toSet The value to set the Node's data value to.
     */
    public void setData(String toSet) {
        this.data = toSet;
    }

    /**
     * This function is for clearing the values of the node. This is helpful in that
     * it helps with memory in the pool as well has keeps them in a clear state so
     * they can be built in to new nodes when needed.
     */
    public void clearNode() {
        this.data = "";
        this.next = null;
    }
}
