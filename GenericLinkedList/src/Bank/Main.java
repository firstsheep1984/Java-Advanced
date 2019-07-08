package Bank;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Entry entry1 = new Entry("apple", 1);
        Entry entry2 = new Entry("pear", 1);
        Entry entry3 = new Entry("banana", 3);

        LinkedList1<Entry> linkedList1 = new LinkedList1<Entry>();
        linkedList1.addToStart(entry1);
        linkedList1.addToStart(entry2);
        linkedList1.addToStart(entry3);

        linkedList1.outputList();

    }
}
