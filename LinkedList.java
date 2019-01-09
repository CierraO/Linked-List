public class LinkedList
{

    // This is the first node in the list
    Node headNode;
    // A variable that will be used to access the nodes
    Node currentNode;


    /**
     * Constructor that creates a linked list with one node
     * @param data is a String that will be stored in the first node
     */
    public LinkedList(String data)
    {
        headNode = new Node(data);
    }

    /**
     * Adds a node to the end of the linked list
     * @param data is a String that will be stored in the new node
     */
    public void append(String data)
    {
        currentNode = headNode;
        // While currentNode has a node next to it, it is set to that node
        // so it eventually ends up at the last node
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        // A new node is created next to the last node
        currentNode.next = new Node(data);
    }

    /**
     * Inserts a new node next to any current node in the list
     * @param position is the position of the node after which the new node will be created
     * @param data is a String that will be stored in the new node
     */
    public void insert(int position, String data)
    {
        // If the new node will be the first node, it gets headNode as its next
        // and then headNode is set to this new node
        if(position == 0)
        {
            Node newNode = new Node(data);
            newNode.next = headNode;
            headNode = newNode;
        }
        else
        {
            currentNode = headNode;
            // Finds the node after which the new node will be created
            for(int i = 0; i < position-1; i++)
            {
                currentNode = currentNode.next;
            }
            // Creates a new node to temporarily store the rest of the list
            Node movedNode = currentNode.next;
            // The new node is created after currentNode and then the rest of the list is added at the end
            currentNode.next = new Node(data);
            currentNode.next.next = movedNode;  
        }
        
    }

    /**
     * Removes the node after the inputted position
     */
    public void remove(int position)
    {
        // If the first node is being deleted, headNode gets the second node
        if(position == 1)
        {
            headNode = headNode.next;
        }
        else
        {
            currentNode = headNode;
            // Finds the node before the one you want to delete
            for(int i = 0; i < position-1; i++)
            {
                currentNode = currentNode.next;
            }
            // The node after currentNode is set to the one after the deleted node
            currentNode.next = currentNode.next.next;
        }
    }

    /**
     * Returns the node next to the node in the inputted position
     * @param position is the position of the node you will check
     * @return returns the node next to the node you are checking
     */
    public Node getNext(int position)
    {
        currentNode = headNode;
        for(int i = 0; i <= position; i++)
        {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    /**
     * Prints the String stored in every node in the linked list
     */
    public void printList()
    {
        currentNode = headNode;
        System.out.println(currentNode.data);
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }

}