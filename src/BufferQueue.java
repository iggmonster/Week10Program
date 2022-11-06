import java.util.Iterator;
import java.util.LinkedList;

/*
@author Keiffer Button
Class: CS1131 Accelerated Intro to Programming
Lab: L01
 */
public class BufferQueue<T> implements QueueInterface<T>, Iterable<T>{

    //public int last;

    //private static Character[] queue;
    private static LinkedList<Character> queuell;
    public int limit;

    public BufferQueue(T i) {

    }

    public BufferQueue() {

    }

    //constructor
    public void bufferSize(int sizeLimit ){

        //queue = new Character[sizeLimit];
        limit = sizeLimit;
        queuell = new LinkedList<>();
    }
/*
    public BufferQueue(){
        queuell = new LinkedList<>();
        //last = 0;
    }


 */

    @Override
    public void enqueue(T element) throws QueueFullException {
        //queue[last] = (Character) element;
        //last++;
        //System.out.println("Before: " + queuell.toString());
        queuell.addLast((Character) element);
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        return (T) queuell.poll();
    }

    @Override
    public T peek() throws QueueEmptyException {
        return (T) queuell.peek();
    }

    @Override
    public boolean isEmpty() {
        if (queuell.peekFirst() == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (queuell.size() == limit){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int size() {
        return queuell.size();
    }

    public int getSizeLimit(){
        //return queue.length;
        return queuell.size();
    }

    public static String bufferToString(){
        //return Arrays.toString(queue);
        return queuell.toString();
    }

    public void clearQueue(){
        queuell.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
