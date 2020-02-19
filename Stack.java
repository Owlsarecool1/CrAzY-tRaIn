
public class Stack {
    private Node top;
    public Stack()
    {
        top=null;
    }
    public void push(int x)
    {
        Node temp=new Node(x);
        temp.setNext(top);
        top=temp;
    }
    public int pop()
    {
        int temp=top.getValue();
        top=top.getNext();
        return temp;
    }
    public int top()
    {
        int temp=top.getValue();
        return temp;
    }
    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        else
            return false;
    }
}
