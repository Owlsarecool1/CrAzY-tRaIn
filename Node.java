public class Node {
    private Integer value;
    private Node next;
    public Node(int v)
    {
        value = v;
        next = null;
    }
    public void setNext(Node a)
    {
        next = a;
    }
    public Node getNext()
    {
        return next;
    }
    public void display()
    {
        System.out.print(value);
    }
    public Integer getValue()
    {
        return value;
    }
    public void setValue(Integer val)
    {
        value = val;
    }
}


