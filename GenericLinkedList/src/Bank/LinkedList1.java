package Bank;

import java.util.Objects;

public class LinkedList1<T> {
    // inner class - Node<T>
    private class Node1<T> {
        private T data;
        private Node1<T> link;

        public Node1() {
            data = null;
            link = null;
        }

        public Node1(T data, Node1<T> link) {
            this.data = data;
            this.link = link;
        }
    }

    private Node1<T> head;

    public LinkedList1() {
        head = null;
    }

    public LinkedList1(Node1<T> head) {
        this.head = head;
    }

    public void addToStart(T data) {
        head = new Node1<T>(data, head);
    }

    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.link;
            return true;
        }
        return false;
    }

    public int size() {
        int counter = 0;
        Node1<T> position = head;
        while (position != null) {
            position = position.link;
            counter++;
        }
        return counter;
    }

    public boolean contains(T target) {
        return (find(target) != null);
    }

    public Node1<T> find(T target) {
        T itemAtposition;
        Node1<T> position = head;
        while (position != null) {
            itemAtposition = position.data;
            if (itemAtposition.equals(target)) {
                return position;
            }
            position = position.link;
        }
        return null;
    }

    public T findData(T target) {
        return find(target).data;
    }

    public void outputList() {
        Node1<T> position = head;
        while (position != null) {
            // needs toString in T
            System.out.println(position.data);
            position = position.link;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public boolean equals(Object o) {
        // if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        else {
            LinkedList1<T> that = (LinkedList1<T>) o;
            if (size() != ((LinkedList1<T>) o).size())
                return false;
            Node1<T> postion = head;
            Node1<T> OPostion = ((LinkedList1<T>) o).head;
            while (postion != null) {
                if (!postion.data.equals(OPostion.data))
                    return false;
                postion = postion.link;
                OPostion = OPostion.link;
            }
            return true;
        }
    }
}
