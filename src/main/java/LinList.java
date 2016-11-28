import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ScorpionOrange on 2016/11/27.
 * update in 2016.11.29 again
 */
public class LinList implements List {
    private Node head;   // 头指针
    private Node current;    // 当前节点位置
    private int size;    // 数据元素个数

    public static void main(String[] args) throws Exception{
        LinList ll = new LinList();

        // 节点数据
        Node n = new Node(1, null);

        // 头节点
        ll.head = new Node(null, n);

        ll.insert(0, 0);
        ll.insert(1, 2);
        ll.insert(2, 4);
        ll.insert(3, 6);
        ll.insert(4, 8);
        System.out.println("链表数据长度：" + ll.size);
        System.out.println("获取指定数据（获取下标为4的数据）：" + ll.getData(4));
        System.out.println("删除指定数据（删除下标为3的数据）：" + ll.delete(3));
        System.out.println("删除后的链表长度：" + ll.size);

    }

    public LinList(){
        head = current = new Node(null);
        this.size = 0;
    }

    public void index(int i) throws Exception{
        if(i < -1 || i > size - 1){
            throw new Exception("参数错误！");
        }
        if(i == -1) return;
        this.current = head.getNext();
        int j = 0;
        while ((current != null) && (j < i)){
            current = current.getNext();
            j++;
        }
    }

    // 插入数据
    public void insert(int i, Object object) throws Exception{
        if(i < 0 || i > size){
            throw new Exception("参数错误！");
        }
        index(i - 1);
        current.setNext(new Node(object, current.getNext()));
        size++;
    }

    // 删除数据
    public Object delete(int i) throws Exception{
        if(size == 0){
            throw new Exception("链表已空，无元素可删！");
        }
        if(i < 0 || i > size - 1){
            throw new Exception("参数错误！");
        }
        index(i - 1);
        Object object = current.getNext().getElement();
        current.setNext(current.getNext().getNext());
        size--;
        return object;
    }

    // 获取数据
    public Object getData(int i) throws Exception{
        if(i < -1 || i > size - 1){
            throw new Exception("参数错误");
        }
        index(i);
        return current.getElement();
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
