/**
 * Created by ScorpionOrange on 2016/11/27.
 */
public class Node {
    Object element;    // 数据元素；
    Node next;    // 表示下一个结点的对象引用；

    Node(Node nextval){
        next = nextval;
    }

    Node(Object object, Node nextval){
        element = object;
        next = nextval;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node nextval){
        next = nextval;
    }

    public Object getElement(){
        return element;
    }

    public void setElement(Object object){
        element = object;
    }

    public String toString(){
        return element.toString();
    }
}
