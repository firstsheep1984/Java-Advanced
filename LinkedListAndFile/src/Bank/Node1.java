package Bank;

public class Node1 {
    private String name;
    private Node1 link;

    public Node1(String name, Node1 link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node1 getLink() {
        return link;
    }

    public void setLink(Node1 link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Node1{" +
                "name='" + name + '\'' +
                ", link=" + link +
                '}';
    }
}
