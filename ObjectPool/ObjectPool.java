import java.util.*;

// This is my object pool!
public class ObjectPool {
    // These two ints, though their name should imply their functionality.
    private int created, recycled; // Number of nodes created and recycled back into the list.
    private Stack<Node> theStack; // Using a stack to hold empty nodes to recycle.

    /**
     * Default constructor initializes base values.
     */
    ObjectPool() {
        this.created = 0;
        this.recycled = 0;
        this.theStack = new Stack<Node>(); // Empty stack.
        /*
         * You could initialize a bunch of empty nodes here. I've read this is one of
         * main reasons to use a pool is specific memory management including large data
         * requirement initialization.
         */
    }

    /**
     * This is the getNode function.
     * 
     * @param data This is the data that we want to hold in the Node.
     * @param next This is a reference to the next Node.
     * @return It returns the Node that is created, or recycled.
     */
    public Node getNode(String data, Node next) {
        // If we don't have any nodes to recycle then we will make one.
        if (this.theStack.isEmpty()) {
            ++this.created;
            return new Node(data, next);
        }
        // Otherwise lets use one from the stack of recycled nodes.
        Node aNode = theStack.pop();
        aNode.setData(data);
        aNode.setNext(next);
        ++recycled;
        return aNode;
    }

    /**
     * This function recycles a given Node.
     * 
     * @param toRecycle This is the node that we want to recycle.
     */
    public void recycle(Node toRecycle) {
        toRecycle.clearNode(); // Uses the Node class clearNode() to empty it's fields.
        this.theStack.push(toRecycle);
    }

    /**
     * This is a imple function to return some statistics about what the object pool
     * has done and what is is doing.
     * 
     * @return It returns the String generated from the values held.
     */
    public String showStats() {
        if (theStack.size() == 1) {
            return "There have been " + this.created + " Nodes created, " + this.recycled + " Nodes recycled, and " + 1
                    + " Nodes is currently being held in the pool."; // Because grammar is important.
        }
        return "There have been " + this.created + " Nodes created, " + this.recycled + " Nodes recycled, and "
                + theStack.size() + " Nodes are currently being held in the pool.";
    }
}
