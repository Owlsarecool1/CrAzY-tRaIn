
public class Queue {
    private Node front;
    public Queue()
    {
        front=null;
    }
    public void enque(int x)
    {
        Node temp=new Node(x);
        Node current=front;
        if (front==null)
        {
            front=temp;
        }
        else
        {
            while(current.getNext()!=null)
            {
                current=current.getNext();
            }
            current.setNext(temp);
        }
    }
    public int deque()
    {
        int temp=front.getValue();
        front=front.getNext();
        return temp;
    }
    public int front()
    {
        int temp=front.getValue();
        return temp;
    }
    public boolean isEmpty()
    {
        if (front==null)
        {
            return true;
        }
        else
            return false;
    }
    public void display()
    {
        Node temp=front;
        int count=0;
        while(temp!=null)
        {
            temp.display();
            if(temp.getNext()!= null)
            {
                System.out.print("-");
            }
            temp=temp.getNext();
            count++;
        }
        System.out.println();
    }
}
