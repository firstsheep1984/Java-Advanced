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

    public boolean deleteHeadNode(){
        if(head != null){
            head = head.getLink();
            return true;
        }
        return false;
    }

    public int size(){
        int counter = 0;
        Node1 position = head;
        while(position != null){
            position = position.getLink();
            counter++;
        }
        return counter;
    }

    public boolean contains(String target){
        String itemAtposition;
        Node1 position = head;
        while  (position != null){
            itemAtposition = position.getName();
            if(itemAtposition.equals(target)){
                return true;
            }
            position = position.getLink();
        }
        return false;
    }

   /* public boolean contains(String item)
    {
        return (find(item) != null);
    }*/
    public Node1 find(String target){
        String itemAtposition;
        Node1 position = head;
      while  (position != null){
          itemAtposition = position.getName();
          if(itemAtposition.equals(target)){
              return position;
          }
          position = position.getLink();
      }
      return null;
    }

    public void outputList(){
        Node1 position = head;
        while(position != null)
        {
            System.out.println(position.getName());
            position = position.getLink();
        }
    }
    public boolean isEmpty(){
        return (head == null);
    }
}
