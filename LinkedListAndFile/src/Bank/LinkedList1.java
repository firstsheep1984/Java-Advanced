package Bank;

public class LinkedList1 {
    private Node1 head;

    public LinkedList1() {
        head = null;
    }

    public LinkedList1(Node1 head) {
        this.head = head;
    }

    public void addToStart(String name){
        head = new Node1(name, head);
    }


    public void outputList(){
        Node1 position = head;
        while(position != null)
        {
            System.out.println(position.getName());
            position = position.getLink();
        }
    }

}
