public class Driver
{

    public static void main(String[] args)
    {
        LinkedList groceryList = new LinkedList("Apples");

        groceryList.printList();

        groceryList.append("Cheese");
        groceryList.append("Lettuce");

        System.out.println();
        groceryList.printList();

        groceryList.insert(2, "Milk");
        groceryList.insert(1, "Bread");
        groceryList.insert(0, "Meat");

        System.out.println();
        groceryList.printList();

        groceryList.remove(2);
        
        System.out.println();
        groceryList.printList();
    }

}