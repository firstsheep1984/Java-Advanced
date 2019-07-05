package Bank;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList1 linkedList1 = new LinkedList1();
        linkedList1.addToStart("apple");
        linkedList1.addToStart("pear");
        linkedList1.addToStart("banana");
        linkedList1.addToStart("banana");

        System.out.println("This list has " + linkedList1.size() + " items. the items are ");
        linkedList1.outputList();
       // System.out.println(linkedList1.isEmpty());

        linkedList1.deleteHeadNode();

        if (linkedList1.contains("banana")) {
            System.out.println("Head node - 'banana' is not deleted, its postion is " + linkedList1.find("banana").getName());
        } else {
            System.out.println("Head node - 'banana' is deleted, its postion is " + linkedList1.find("banana"));
        }
        while (linkedList1.deleteHeadNode()) ;

        System.out.println("This is the head of the list: ");
        linkedList1.outputList();
        System.out.println("This is the end of the list: ");
    }
}
