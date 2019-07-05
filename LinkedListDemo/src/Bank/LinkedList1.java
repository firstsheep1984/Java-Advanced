package Bank;

public class LinkedList1 {
    private Node1 head;

    public LinkedList1() {
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
        while(head != null){
            head = head.getLink();
            counter++;
        }
        return counter;
    }

    public boolean contains(String target){
        while(head != null){
            if(head.getName().equals(target)){
                return true;
            }else{
                head.getLink();
            }
        }
       return false;
    }

    public Node1 find(String target){
        String itemAtposition;
      while  (head != null){
          itemAtposition = head.getName();
          if(itemAtposition.equals(target)){
              return head;
          }
          head = head.getLink();
      }
      return null;
    }

    public void outputList(){
        while(head != null){
            System.out.println(head.toString());
            head.getLink();
        }
    }
    public boolean isEmpty(){
        return (head == null);
    }
}
